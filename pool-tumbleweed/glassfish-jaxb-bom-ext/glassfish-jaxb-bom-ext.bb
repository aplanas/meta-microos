SUMMARY = "JAXB BOM with all dependencies"
DESCRIPTION = "JAXB Bill of Materials (BOM) with all dependencies."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-bom-ext-2.3.1-4.5.noarch.rpm"
RPM_HASH = "93d441bf18bc87cb601e51147a4a03ea0c2a31b6e1275ff12e65b51655a450359942a6fbbfaff60854310f3686fb9b6b76067af22402a017039292651185ce17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-bom-ext \
mvn-com.sun.xml.bind-jaxb-bom-ext-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.glassfish.jaxb-jaxb-bom-pom-"

inherit rpm
