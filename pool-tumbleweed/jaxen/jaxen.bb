SUMMARY = "The jaxen project is a Java XPath Engine"
DESCRIPTION = "Jaxen is a universal object model walker, capable of evaluating XPath \
expressions across multiple models. Currently supported are dom4j, \
JDOM, and DOM."
LICENSE = "Apache-2.0"

PV = "1.1.6"

RPM_NAME = "jaxen-1.1.6-39.7.noarch.rpm"
RPM_HASH = "5cdbb8edcd107ff283f0be0508691acbd2629f3c15962ed8ad2e677b814ea4a5a63931134eefb04bde943d22e778d4426b4bfd4362b7f1ac7dd4078f0ba4c8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxen \
jaxen-bootstrap \
mvn-jaxen-jaxen \
mvn-jaxen-jaxen-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-dom4j-dom4j \
mvn-jdom-jdom \
mvn-xerces-xercesImpl \
mvn-xml-apis-xml-apis \
mvn-xom-xom"

inherit rpm
