SUMMARY = "LALR Parser Generator in Java"
DESCRIPTION = "java-cup is a LALR Parser Generator in Java. With v0.11, you can: * \
   use CUP in an Ant-Target \
 \
* start CUP by a simple command like java -jar java-cup-11a.jar \
   myGrammar.cup \
 \
* use generic parametrized classes (since Java 1.5) as datatypes for \
   non terminals and terminals \
 \
* have Your own symbol classes"
LICENSE = "HPND"

PV = "0.11"

RPM_NAME = "java-cup-0.11-32.1.noarch.rpm"
RPM_HASH = "e6ef5186ca1efd839596671d3e0da99eeb6f12e137da2717c4fb1b36ed3a1e7ba8b958c4b2d79e045c13762480ffdcbb8fcc24517ee54a789b2327459063e08c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-cup \
mvn-com.github.vbmacher-java-cup \
mvn-com.github.vbmacher-java-cup-runtime"

RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem"

inherit rpm
