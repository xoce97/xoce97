package Java.ejercicio2;

public class Main {
    static void myMethod() {
        System.out.println("I just got executed!");
    } 
    public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0

    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());

    String tx = "Hello World";
    System.out.println(tx.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(tx.toLowerCase());   // Outputs "hello world"
  
    String t = "Please locate where 'locate' occurs!";
    System.out.println(t.indexOf("locate")); // Outputs 7
    
    int time = 20;
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);

    myMethod();
    }

}
