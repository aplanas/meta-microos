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

RPM_NAME = "jdom2-2.0.6.1-1.6.noarch.rpm"
RPM_HASH = "c1707ac98c08be6fed81a774a917ff8abfbf41a2c1f9e6d14e8ca0e76f6636ac5df0866e4f9edc932823539c820b33b211533c6b7aa9e3018e6a4c02a2e6747a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdom2 \
mvn(org.jdom:jdom2) \
mvn(org.jdom:jdom2-contrib) \
mvn(org.jdom:jdom2-contrib:pom:) \
mvn(org.jdom:jdom2-junit) \
mvn(org.jdom:jdom2-junit:pom:) \
mvn(org.jdom:jdom2:pom:)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
