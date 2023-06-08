SUMMARY = "JarJar of dom4j for JBoss"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-1.6.1-36.4.noarch.rpm"
RPM_HASH = "4f93f92ddedf2703756d6204834222ff421901490aa0d875a69eb80eb327f9dfdfcbe9f6d8c4014eec5ade67290812403315b2090f3870dd465bff52639472b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j mvn(dom4j:dom4j) mvn(dom4j:dom4j:pom:) mvn(org.dom4j:dom4j) mvn(org.dom4j:dom4j:pom:)"
RDEPENDS:${PN} += "bea-stax glassfish-jaxb-api isorelax java java-headless javapackages-filesystem javapackages-tools jaxen mvn(xml-apis:xml-apis) relaxngDatatype stax_1_0_api ws-jaxme xalan-j2 xerces-j2 xpp2 xpp3"

inherit rpm
