SUMMARY = "JarJar of dom4j for JBoss"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-1.6.1-37.1.noarch.rpm"
RPM_HASH = "3225361a2ff21eaad821aecf3f731d27b3516f12818e75dc1e453b7fbf910a0034a8288d099ae9d54c12684308fa11a5a76ba104a8f479153992d9d274724708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j \
mvn-dom4j-dom4j \
mvn-dom4j-dom4j-pom- \
mvn-org.dom4j-dom4j \
mvn-org.dom4j-dom4j-pom-"

RDEPENDS:${PN} += "bea-stax \
glassfish-jaxb-api \
isorelax \
java \
java-headless \
javapackages-filesystem \
javapackages-tools \
jaxen \
mvn-xml-apis-xml-apis \
relaxngDatatype \
stax-1-0-api \
ws-jaxme \
xalan-j2 \
xerces-j2 \
xpp2 \
xpp3"

inherit rpm
