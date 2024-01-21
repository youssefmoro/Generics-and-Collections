////comparable
//import java.util.*;
//public  class Duck implements Comparable<Duck>{
//    private String name;
//    public Duck(String name)
//    {
//        this.name=name;
//    }
//    public String toString()
//    {
//        return name;
//    }
//    public int compareTo(Duck d)
//    {
//        return name.compareTo(d.name);
//        //if comparing int
//        // return intProperty - d.arguement this way will sort in ascending order
//        // return d.argument - intProperty this way will sort in descending order
//    }
//    public static void main (String[] args){
//        List<Duck> duck=new ArrayList<Duck>();
//        duck.add(new Duck("Quack"));
//        duck.add(new Duck("Puddles"));
//        Collections.sort(duck);
//        System.out.println(duck);
//
//    }
//}

// comparator
import java.util.*;
public  class Duck implements Comparable<Duck>{
    private String name;
    private int weight;
    public Duck(String name, int weight)
    {
        this.name=name;
        this.weight=weight;
    }
    public String getName()
    {
        return this.name;
    }
    public int getWeight()
    {
        return this.weight;
    }
    public String toString()
    {
        return name;
    }
    public int compareTo(Duck d)
    {
        return name.compareTo(d.name);
        //if comparing int
        // return intProperty - d.arguement this way will sort in ascending order
        // return d.argument - intProperty this way will sort in descending order
    }
    public static void main (String[] args){
        Comparator<Duck> byweight= new Comparator<Duck>() {
            @Override
            public int compare(Duck o1, Duck o2) {
                return o1.getWeight()-o2.getWeight();//ascending if reversed = descending
            }
        };
        //using lambdas
       // Comparator<Duck> byweight=(d1,d2)->{return d1.getWeight()- d2.getWeight();};
         //Comparator<Duck> byweight=(d1,d2)->d1.getWeight()- d2.getWeight();
        //Comparator<Duck> byweight=(Duck d1,Duck d2)->d1.getWeight()- d2.getWeight();
        List<Duck> duck=new ArrayList<Duck>();
        duck.add(new Duck("Quack",50));
        duck.add(new Duck("Puddles",75));
        Collections.sort(duck);
        System.out.println(duck);
        Collections.sort(duck,byweight);// pass the comparator method that you have done
        System.out.println(duck);

    }
}