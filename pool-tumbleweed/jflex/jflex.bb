SUMMARY = "Lexical Analyzer Generator for Java"
DESCRIPTION = "JFlex is a lexical analyzer generator for Java written in Java. It is \
also a rewrite of the very useful tool JLex which was developed by \
Elliot Berk at Princeton University. As Vern Paxson states for his C/C++ \
tool flex: they do not share any code though. \
 \
Design goals The main design goals of JFlex are: \
 \
    * Full unicode support \
    * Fast generated scanners \
    * Fast scanner generation \
    * Convenient specification syntax \
    * Platform independence \
    * JLex compatibility"
LICENSE = "BSD-3-Clause"

PV = "1.8.2"

RPM_NAME = "jflex-1.8.2-5.2.noarch.rpm"
RPM_HASH = "b517ea3bfb36b13280f08d6bb5e29cef8a1adc659443e316084d94bfd2064ac6ee327e40a137fbb70df89556edf24cf1908bf0b27030b37997f384cdd223f5b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex \
mvn-de.jflex-jflex \
mvn-de.jflex-jflex-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
java-cup \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.github.vbmacher-java-cup-runtime \
mvn-org.apache.ant-ant"

inherit rpm
