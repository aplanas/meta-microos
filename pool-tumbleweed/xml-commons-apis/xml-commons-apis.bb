SUMMARY = "APIs for DOM, SAX, and JAXP"
DESCRIPTION = "xml-commons-apis is designed to organize and have common packaging for \
the various externally-defined standard interfaces for XML. This \
includes the DOM, SAX, and JAXP."
LICENSE = "Apache-2.0 & W3C & SUSE-Public-Domain"

PV = "1.4.01"

RPM_NAME = "xml-commons-apis-1.4.01-4.7.noarch.rpm"
RPM_HASH = "9f3b4faf445b44dc2df6da747e3f73843d9914af8262508e216d9ba14dd3c01fb0f5135105d02949d30a1b4ce0b3eae9e32d6745012fa1d9eafc140684a45eb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-xerces-dom3-xml-apis \
mvn-xerces-dom3-xml-apis-pom- \
mvn-xml-apis-xml-apis \
mvn-xml-apis-xml-apis-ext \
mvn-xml-apis-xml-apis-ext-pom- \
mvn-xml-apis-xml-apis-pom- \
osgi-javax.xml \
osgi-org.w3c.dom.svg \
xerces-j2-xml-apis \
xml-apis \
xml-commons-apis \
xml-commons-jaxp-1.1-apis \
xml-commons-jaxp-1.2-apis \
xml-commons-jaxp-1.3-apis \
xml-commons-jaxp-1.4-apis"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
