SUMMARY = "LALR Parser Generator in Java"
DESCRIPTION = "java-cup is a LALR Parser Generator in Java. With v0.11, you can: * \
   use CUP in an Ant-Target \
 \
* start CUP by a simple command like java -jar java-cup-11a.jar \
   myGrammar.cup \
 \
* use generic parametrized classes (since Java 1.5) as datatypes for \
   non \
 \
* terminals and terminals \
 \
* have Your own symbol classes"
LICENSE = "HPND"

PV = "0.11"

RPM_NAME = "java-cup-manual-0.11-32.1.noarch.rpm"
RPM_HASH = "8d99345a18d299b25662ba191555d5d5eba6a84a109cc795112c368540cd396fd6e73be63fb4fb480fc714a8edc9a81c9aba70b5e62669d835e02e08e1ebab25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-cup-manual"

RDEPENDS:${PN} += ""

inherit rpm
