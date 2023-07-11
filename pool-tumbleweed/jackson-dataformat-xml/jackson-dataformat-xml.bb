SUMMARY = "Jackson extension component for reading and writing XML encoded data"
DESCRIPTION = "Data format extension for Jackson (http://jackson.codehaus.org) \
to offer alternative support for serializing POJOs as XML and \
deserializing XML as POJOs. Support implemented on top of Stax API \
(javax.xml.stream), by implementing core Jackson Streaming API types \
like JsonGenerator, JsonParser and JsonFactory. Some data-binding types \
overridden as well (ObjectMapper sub-classed as XmlMapper)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-xml-2.13.3-1.8.noarch.rpm"
RPM_HASH = "5c7e82fda95f0f9e14567e07967975ca388016d2bcba7d58b288ea206b66fcf4bcc2ead4a4d64835081d89fd28c3c5c6470c071d2a0108fdbf7824e96aea79a6"
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
