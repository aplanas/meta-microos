SUMMARY = "JDOM is a Java Representation of an XML Document"
DESCRIPTION = "JDOM is, quite simply, a Java representation of an XML document. JDOM \
provides a way to represent that document for easy and efficient \
reading, manipulation, and writing. It has a straightforward API, is \
lightweight and fast, and is optimized for the Java programmer. It is \
an alternative to DOM and SAX, although it integrates well with both \
DOM and SAX."
LICENSE = "Apache-2.0"

PV = "1.1.3"

RPM_NAME = "jdom-1.1.3-39.7.noarch.rpm"
RPM_HASH = "9301245d537965101ec26369108ca20fa6d02700250ed5fc54e75724b5cc448d51b295e0ade185ee202a865d291163211f87fe66db87b35cb9c1964c08bc8c2e"
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
