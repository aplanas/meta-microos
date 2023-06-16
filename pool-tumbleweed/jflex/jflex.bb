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

RPM_NAME = "jflex-1.8.2-5.1.noarch.rpm"
RPM_HASH = "2599cc6cc29d9d5c8b2eb8f22966f9024154afd8f7b1ddda6c893089abaad28dfd3ba4165f309b9e91316c6e9c5cc3a308a39a95ce5c0cb7ac73da223af11b9e"
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
