SUMMARY = "Bug pattern detector for Java"
DESCRIPTION = "Findbugs is a program which uses static analysis to look for bugs in Java code. \
It can check for null pointer exceptions, multithreaded code errors, and other \
bugs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "findbugs-3.0.1-2.20.noarch.rpm"
RPM_HASH = "9e1604a9474ebc88e836dcc114c530abb6d2cf9ee5703c8a80470eaf260751410142e020eca558bcbfd5d8967bf8207689f51271dae1fa1bff1493805e2894fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "findbugs \
mvn-com.google.code.findbugs-annotations \
mvn-com.google.code.findbugs-annotations-pom- \
mvn-com.google.code.findbugs-findbugs \
mvn-com.google.code.findbugs-findbugs-pom- \
mvn-net.sourceforge.findbugs-annotations \
mvn-net.sourceforge.findbugs-annotations-pom- \
mvn-net.sourceforge.findbugs-findbugs \
mvn-net.sourceforge.findbugs-findbugs-pom- \
osgi-edu.umd.cs.findbugs.plugins.noUpdateChecks \
osgi-findbugsAnnotations"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
apache-commons-lang \
dom4j \
findbugs-bcel \
java \
java-headless \
javapackages-filesystem \
jaxen \
jcip-annotations \
jformatstring \
jpackage-utils \
jsr-305 \
junit \
mvn-com.google.code.findbugs-bcel-findbugs \
mvn-com.google.code.findbugs-jFormatString \
mvn-com.google.code.findbugs-jsr305 \
mvn-commons-lang-commons-lang \
mvn-dom4j-dom4j \
mvn-jaxen-jaxen \
mvn-net.jcip-jcip-annotations \
mvn-org.ow2.asm-asm-commons \
mvn-org.ow2.asm-asm-debug-all \
objectweb-asm"

inherit rpm
