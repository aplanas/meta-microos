SUMMARY = "APIs for DOM, SAX, and JAXP"
DESCRIPTION = "xml-commons-apis is designed to organize and have common packaging for \
the various externally-defined standard interfaces for XML. This \
includes the DOM, SAX, and JAXP."
LICENSE = "Apache-2.0 & W3C & SUSE-Public-Domain"

PV = "1.4.01"

RPM_NAME = "xml-commons-apis-1.4.01-4.6.noarch.rpm"
RPM_HASH = "57836177e028287d2e0dc9703d45db4d67fb46af560f64d50572bd7ddc7aba42c9aacefd3795eab4bee0ba0214317125e505e35e43c1f6678d08adfd71e70c8b"
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
