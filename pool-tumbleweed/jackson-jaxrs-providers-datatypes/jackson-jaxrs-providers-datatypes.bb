SUMMARY = "Functionality for reading/writing core JAX-RS helper types"
DESCRIPTION = "Functionality for reading/writing core JAX-RS helper types."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-providers-datatypes-2.13.3-1.8.noarch.rpm"
RPM_HASH = "375d25a689770a40e241bd89703e633c57454f4c6dc0994b1d4efcba6b409eb3c0673a4066c86fc4614523f27ab1839677f52a4198dee3d76c000ae173ccf0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-datatypes \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jaxrs \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jaxrs-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-jaxrs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
