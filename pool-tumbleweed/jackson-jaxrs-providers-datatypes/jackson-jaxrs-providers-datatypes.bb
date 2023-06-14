SUMMARY = "Functionality for reading/writing core JAX-RS helper types"
DESCRIPTION = "Functionality for reading/writing core JAX-RS helper types."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-providers-datatypes-2.13.3-1.7.noarch.rpm"
RPM_HASH = "5d5318e274d162449faf93d738c1e9122cb16a0ef8340d776221ee3279ae5a36cc61cae69ee563d4bd7b019f1ede875292ccb355255ad4af463a010285e3d1fc"
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
