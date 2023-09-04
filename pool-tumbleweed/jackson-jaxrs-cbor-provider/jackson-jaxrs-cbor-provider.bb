SUMMARY = "Jackson-JAXRS-CBOR"
DESCRIPTION = "Functionality to handle CBOR encoded input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-cbor-provider-2.15.2-1.1.noarch.rpm"
RPM_HASH = "6b19c0a957ec14cb1cb9b7c36c440e8ae7e0bab48b33af5da926e3e6ecb1eafa754f4baef4859935e187b0353c5dc814d9790c97b30456bd1285c615deab7232"
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
