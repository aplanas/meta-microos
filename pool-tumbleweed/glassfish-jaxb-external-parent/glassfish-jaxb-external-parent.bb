SUMMARY = "JAXB External parent POM"
DESCRIPTION = "JAXB External parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-external-parent-2.3.1-4.4.noarch.rpm"
RPM_HASH = "3d7a79d899841728e9a3ff969330fb862fea2a65e0e94bb4eb2e12f00a28f475a3b4744e0e562169c89144455ae811f87a86b6f73bb950e2a71489191f39e5e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-external-parent \
mvn-com.sun.xml.bind.mvn-jaxb-external-parent-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.xml.bind.mvn-jaxb-parent-pom-"

inherit rpm
