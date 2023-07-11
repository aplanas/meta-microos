SUMMARY = "Java manipulation of XML"
DESCRIPTION = "JDOM is a Java-oriented object model which models XML documents. \
It provides a Java-centric means of generating and manipulating \
XML documents. While JDOM inter-operates well with existing \
standards such as the Simple API for XML (SAX) and the Document \
Object Model (DOM), it is not an abstraction layer or \
enhancement to those APIs. Rather, it provides a means of \
reading and writing XML data."
LICENSE = "Saxpath"

PV = "2.0.6.1"

RPM_NAME = "jdom2-2.0.6.1-1.7.noarch.rpm"
RPM_HASH = "e229007d153d2a57f6d444ea9151790ed3a15381e829fd3d0c219c2dced2256456a721c6b0fb5308646822eba3be9ad3a54d3b5ed28bb611cdbb5510c363d2c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom2 \
mvn-org.jdom-jdom2 \
mvn-org.jdom-jdom2-contrib \
mvn-org.jdom-jdom2-contrib-pom- \
mvn-org.jdom-jdom2-junit \
mvn-org.jdom-jdom2-junit-pom- \
mvn-org.jdom-jdom2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
