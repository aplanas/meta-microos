SUMMARY = "Bug pattern detector for Java"
DESCRIPTION = "Findbugs is a program which uses static analysis to look for bugs in Java code. \
It can check for null pointer exceptions, multithreaded code errors, and other \
bugs."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.1"

RPM_NAME = "findbugs-3.0.1-2.21.noarch.rpm"
RPM_HASH = "683bd642e5a2d66ad0c229bb74b83d7d438bbd886c2deb02add672b45baa93bbd835c98f5d4f5e8719287b4c6889f4715bfbfdc8f329f2a7dac9d81e827d618e"
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
