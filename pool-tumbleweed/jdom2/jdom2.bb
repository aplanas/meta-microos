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

RPM_NAME = "jdom2-2.0.6.1-2.1.noarch.rpm"
RPM_HASH = "1b99f8497266c5bdd7972b8afea5b9dc873fd163b15378baadbfe49b10b66ceb582673c170e7c46ef4eb45da2ab279246a31582a86c49a0c35cdf9cb411119cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom2 \
mvn-org.jdom-jdom2 \
mvn-org.jdom-jdom2-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
