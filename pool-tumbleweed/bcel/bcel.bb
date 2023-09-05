SUMMARY = "Byte Code Engineering Library"
DESCRIPTION = "The Byte Code Engineering Library is intended to give users a \
convenient way to analyze, create, and manipulate (binary) Java class \
files (those ending with .class). Classes are represented by objects \
that contain all the symbolic information of the given class: methods, \
fields, and byte code instructions, in particular. \
 \
Such objects can be read from an existing file, transformed by a \
program (such as a class loader at runtime), and dumped to a file \
again. An even more interesting application is the creation of classes \
from scratch at runtime. The Byte Code Engineering Library (BCEL) may \
also be useful if you want to learn about the Java Virtual Machine \
(JVM) and the format of Java .class files. \
 \
BCEL is already being used successfully in several projects, such as \
compilers, optimizers, obfuscators, code generators, and analysis \
tools. \
 \
It contains a byte code verifier named JustIce, which usually gives you \
much better information about what is wrong with your code than the \
standard JVM message."
LICENSE = "Apache-2.0"

PV = "6.7.0"

RPM_NAME = "bcel-6.7.0-1.1.noarch.rpm"
RPM_HASH = "a21770668f4d5645851c85abefb43efc27fbfd8c07711e79b8c23bce24d9c4d90a73042257ed7aac63f35bc6a13d403663b56683ea7ebbd16531bd1c85775aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcel \
mvn-bcel-bcel \
mvn-bcel-bcel-pom- \
mvn-org.apache.bcel-bcel \
mvn-org.apache.bcel-bcel-pom- \
osgi-org.apache.bcel"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3"

inherit rpm
