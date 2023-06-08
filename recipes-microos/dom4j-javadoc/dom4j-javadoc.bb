SUMMARY = "XML, XPath and XSLT library for Java"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-javadoc-1.6.1-36.4.noarch.rpm"
RPM_HASH = "7823812a9e3e116f711682025cbd5f44c9e7b0fe01369a5c2318af7b1b24456052efcb76bbbe4ac22f995aa662aef15f7a5e216fe96f5b87594d39f952c6f389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
