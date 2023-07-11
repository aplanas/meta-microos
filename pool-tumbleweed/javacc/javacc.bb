SUMMARY = "A Parser and Scanner Generator for Java"
DESCRIPTION = "Java Compiler Compiler (JavaCC) is the most popular parser generator \
for use with Java applications. A parser generator is a tool that reads \
a grammar specification and converts it to a Java program that can \
recognize matches to the grammar. In addition to the parser generator \
itself, JavaCC provides other standard capabilities related to parser \
generation such as tree building (via a tool called JJTree included \
with JavaCC), actions, debugging, etc."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "javacc-7.0.11-1.6.noarch.rpm"
RPM_HASH = "1d98bce2e55af8adb2129cbc167a95a3fe73da434c7a1479146f190f6e970ffb9603b9ec0b191aaeaa2a65c14196915f14755eadff82d3abfb4304f7c0dbe721"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc \
javacc-bootstrap \
mvn-net.java.dev.javacc-javacc \
mvn-net.java.dev.javacc-javacc-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm
