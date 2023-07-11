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

PV = "2.7.3"

RPM_NAME = "jython-2.7.3-1.1.aarch64.rpm"
RPM_HASH = "536f9b6a5bd55f2356bf29f51f5090f5e577eb8fe893ead65b1ebd33a4bbee7a35d2d4a9663c07983856d9fbf68c6fb0015b4a61c48632fbcff9b4e2bea34e7c"

RPROVIDES:${PN} += "jython \
mvn-jython-jython \
mvn-jython-jython-pom- \
mvn-org.python-jython \
mvn-org.python-jython-pom- \
mvn-org.python-jython-standalone \
mvn-org.python-jython-standalone-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
antlr3-java \
antlr3-tool \
apache-commons-compress \
glassfish-servlet-api \
guava \
jansi \
jarjar \
java-headless \
javapackages-filesystem \
jffi \
jline \
jnr-constants \
jnr-ffi \
jnr-posix \
junit \
lucene-core \
objectweb-asm \
stringtemplate4"

inherit rpm
