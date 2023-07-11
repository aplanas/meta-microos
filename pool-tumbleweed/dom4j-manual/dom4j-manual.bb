SUMMARY = "JarJar of dom4j for JBoss"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-manual-1.6.1-36.5.noarch.rpm"
RPM_HASH = "bdd45df84d8a2f4d478900bbdeac8c1910ce7c7634f5ca05d297977242486600d4ddcbe18b5c9253cd98d40f03f87be0de43da2a6fbfd307ccd60a1306a494ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-manual"

RDEPENDS:${PN} += ""

inherit rpm
