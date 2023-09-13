SUMMARY = "Functionality for reading/writing core JAX-RS helper types"
DESCRIPTION = "Functionality for reading/writing core JAX-RS helper types."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-providers-datatypes-2.15.2-2.1.noarch.rpm"
RPM_HASH = "bfd3bdc91f38bd9edbbceb6de72d16f6353d2890def425e2d9f54988975400bb0e4888e5ec9b83adc87f3e680fcd90ac8ed6ec89e5aef406358af108b08c89cc"
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
