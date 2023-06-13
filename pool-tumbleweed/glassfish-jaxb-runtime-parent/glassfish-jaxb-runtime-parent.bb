SUMMARY = "JAXB Runtime parent POM"
DESCRIPTION = "This package contains Runtime parent POM."
LICENSE = "CDDL-1.1 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-runtime-parent-2.3.1-4.4.noarch.rpm"
RPM_HASH = "860ed46c382e105d9b9904e2764a038ba2fc3f9ca71bce1c6cae1392e92c11517f38936bec7867c11dd3e4f547194c5655edb0491360334eae4a4f0f723e13f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-runtime-parent \
mvn(com.sun.xml.bind.mvn:jaxb-runtime-parent:pom:)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.sun.xml.bind.mvn:jaxb-parent:pom:)"

inherit rpm
