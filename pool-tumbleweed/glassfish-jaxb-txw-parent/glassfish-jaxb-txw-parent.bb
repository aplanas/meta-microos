SUMMARY = "JAXB TXW parent POM"
DESCRIPTION = "This package contains TXW parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-txw-parent-2.3.1-4.4.noarch.rpm"
RPM_HASH = "c6aee39620da97882424aac33e34253e96c8279beceb06589adfbbc90ec8d8723e199963abe6171352d3a8850ebda24cf48d794d22f9869c536de5125a6b4aea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-txw-parent \
mvn-com.sun.xml.bind.mvn-jaxb-txw-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
