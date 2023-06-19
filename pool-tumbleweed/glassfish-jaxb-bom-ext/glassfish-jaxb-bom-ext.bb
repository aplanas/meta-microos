SUMMARY = "JAXB BOM with all dependencies"
DESCRIPTION = "JAXB Bill of Materials (BOM) with all dependencies."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-bom-ext-2.3.1-4.4.noarch.rpm"
RPM_HASH = "131d3c61b50a34c713fc88ca459fac46fdd7a762a33dce9861e467b1f9f81679200e5fd91bd322c63187e38c3098bd403a51dd115efcddf03bc7f7f7487bb62d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-bom-ext \
mvn-com.sun.xml.bind-jaxb-bom-ext-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.glassfish.jaxb-jaxb-bom-pom-"

inherit rpm
