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

PV = "5.2"

RPM_NAME = "bcel-5.2-37.3.noarch.rpm"
RPM_HASH = "2dc585c5c30f76c99534b0fed4ada08d0184ee8be9bf03a06b7496637bd3fb37c497d0c7da9cbdf792290ba8874ed55237eec0653cfa49489b1f28a3e1854b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcel \
mvn-bcel-bcel \
mvn-bcel-bcel-pom- \
mvn-org.apache.bcel-bcel \
mvn-org.apache.bcel-bcel-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jakarta-regexp-jakarta-regexp \
regexp"

inherit rpm
