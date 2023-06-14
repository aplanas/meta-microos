SUMMARY = "A Java implementation of the Python language"
DESCRIPTION = "Jython is an implementation of the high-level, dynamic, object-oriented \
language Python seamlessly integrated with the Java platform. The \
predecessor to Jython, JPython, is certified as 100% Pure Java. Jython \
is freely available for both commercial and noncommercial use and is \
distributed with source code. Jython is complementary to Java and is \
especially suited for the following tasks: Embedded scripting--Java \
programmers can add the Jython libraries to their system to allow end \
users to write simple or complicated scripts that add functionality to \
the application. Interactive experimentation--Jython provides an \
interactive interpreter that can be used to interact with Java packages \
or with running Java applications. This allows programmers to \
experiment and debug any Java system using Jython. Rapid application \
development--Python programs are typically 2-10X shorter than the \
equivalent Java program. This translates directly to increased \
programmer productivity. The seamless interaction between Python and \
Java allows developers to freely mix the two languages both during \
development and in shipping products."
LICENSE = "Apache-2.0 & Python-2.0"

PV = "2.2.1"

RPM_NAME = "jython-2.2.1-25.7.noarch.rpm"
RPM_HASH = "3e51f1bc13b7f4e1d393e6f6cdfeeecc0c5df70aea615125f239eef8265eae61bb450adb9f6526b79297eb07c4e0c7d6d07b0781ee67e863b8edc358ed5db922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jython \
mvn-jython-jython \
mvn-jython-jython-pom- \
mvn-org.python-jython \
mvn-org.python-jython-pom- \
mvn-org.python-jython-standalone \
mvn-org.python-jython-standalone-pom-"

RDEPENDS:${PN} += "jakarta-oro \
java \
java-headless \
javapackages-filesystem \
javapackages-local \
jline1 \
libreadline-java \
python3 \
servletapi5"

inherit rpm
