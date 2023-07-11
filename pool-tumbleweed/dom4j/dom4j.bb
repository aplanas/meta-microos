SUMMARY = "JarJar of dom4j for JBoss"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-1.6.1-36.5.noarch.rpm"
RPM_HASH = "d2fb2e8ef1c45e24cb58d1b6eda5c9e0b7ba8810d84b37b3a5b904359c3f64485b0d2a031244580d5d7543377b6d87c1f7b2b1748c02d7d5d371016dc123adbb"
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
