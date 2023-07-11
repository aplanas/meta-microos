SUMMARY = "RelaxNG Datatype"
DESCRIPTION = "This package contains RelaxNG Datatype."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.3.1"

RPM_NAME = "glassfish-jaxb-relaxng-datatype-2.3.1-4.5.noarch.rpm"
RPM_HASH = "28cc8ef46b4b85ccfbaadd7d2aaed12498a7111b0143c7e25d76e89c7e5f36dbf1ff0b00093888b4e505ed67a4d5ed45fa3703723a39c21a247b076bc85674de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jaxb-relaxng-datatype \
mvn-com.sun.xml.bind.external-relaxng-datatype \
mvn-com.sun.xml.bind.external-relaxng-datatype-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
