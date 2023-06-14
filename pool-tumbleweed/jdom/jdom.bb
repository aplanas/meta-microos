SUMMARY = "JDOM is a Java Representation of an XML Document"
DESCRIPTION = "JDOM is, quite simply, a Java representation of an XML document. JDOM \
provides a way to represent that document for easy and efficient \
reading, manipulation, and writing. It has a straightforward API, is \
lightweight and fast, and is optimized for the Java programmer. It is \
an alternative to DOM and SAX, although it integrates well with both \
DOM and SAX."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "jdom-1.1.3-39.6.noarch.rpm"
RPM_HASH = "905c3f1afde578681e8c11f89da7d6877850b2fcc06631fc1f39dab7868afab0f12e3a5301016710680a3420060b508bedac490b247bbdf8d11ba8f9e610734f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom \
mvn-jdom-jdom \
mvn-jdom-jdom-pom- \
mvn-org.jdom-jdom \
mvn-org.jdom-jdom-pom- \
osgi-org.jdom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jaxen-jaxen \
mvn-xerces-xercesImpl"

inherit rpm
