SUMMARY = "Jackson-JAXRS-CBOR"
DESCRIPTION = "Functionality to handle CBOR encoded input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-cbor-provider-2.15.2-2.1.noarch.rpm"
RPM_HASH = "e4adc94e8ff4ee4d5bfc5b9b4e6101f6f53257f099a69f8f9dac5b82369b7a6c64c7bc4f58561135d2fae04b936be4b08341861f1552115b180865ccb71cd9ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-cbor-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-cbor-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-cbor-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-cbor-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-cbor \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
