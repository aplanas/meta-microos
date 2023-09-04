SUMMARY = "Jackson extension component for reading and writing XML encoded data"
DESCRIPTION = "Data format extension for Jackson (http://jackson.codehaus.org) \
to offer alternative support for serializing POJOs as XML and \
deserializing XML as POJOs. Support implemented on top of Stax API \
(javax.xml.stream), by implementing core Jackson Streaming API types \
like JsonGenerator, JsonParser and JsonFactory. Some data-binding types \
overridden as well (ObjectMapper sub-classed as XmlMapper)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-xml-2.15.2-1.1.noarch.rpm"
RPM_HASH = "828803393c0496a15328f55fea7297044df51bce05055fd3bbad297b0ddedbd3a0cb0d43c316af23289e75a8ac9fe5984625e4c5370e6a60be248bca97cb0fd9"
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
