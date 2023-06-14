SUMMARY = "Jackson extension component for reading and writing XML encoded data"
DESCRIPTION = "Data format extension for Jackson (http://jackson.codehaus.org) \
to offer alternative support for serializing POJOs as XML and \
deserializing XML as POJOs. Support implemented on top of Stax API \
(javax.xml.stream), by implementing core Jackson Streaming API types \
like JsonGenerator, JsonParser and JsonFactory. Some data-binding types \
overridden as well (ObjectMapper sub-classed as XmlMapper)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-xml-2.13.3-1.7.noarch.rpm"
RPM_HASH = "a2e64652c6441c69e3221c1c3bbdab20fc46df04de359e8f3201aa8b47878793ec6add9e38cb18a086b5fc6faa799c97f957185b10128ccd13cd0e7aa9ed61ed"
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
