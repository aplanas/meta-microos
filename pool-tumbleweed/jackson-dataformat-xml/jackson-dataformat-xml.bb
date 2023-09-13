SUMMARY = "Jackson extension component for reading and writing XML encoded data"
DESCRIPTION = "Data format extension for Jackson (http://jackson.codehaus.org) \
to offer alternative support for serializing POJOs as XML and \
deserializing XML as POJOs. Support implemented on top of Stax API \
(javax.xml.stream), by implementing core Jackson Streaming API types \
like JsonGenerator, JsonParser and JsonFactory. Some data-binding types \
overridden as well (ObjectMapper sub-classed as XmlMapper)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-xml-2.15.2-2.1.noarch.rpm"
RPM_HASH = "432a02f3aceba7a4790ed1e10d341e839b176a7f73b51f5fab8e96e8a5d3c29005a8754ba24b961127943c0b069b8475a73bd0cb114ad4c764849127d3411ad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-xml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-xml \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-xml-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-xml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.woodstox-woodstox-core \
mvn-org.codehaus.woodstox-stax2-api"

inherit rpm
