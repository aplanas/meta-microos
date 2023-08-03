SUMMARY = "JarJar of dom4j for JBoss"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-manual-1.6.1-37.1.noarch.rpm"
RPM_HASH = "5656faa6144dc5b57695bc09eea201b1e66950ce9f4cfbf3ff2c35ebb7c15b73de4c98dbe72cb10ba178916d7d4b427263371d42af2d6d2ca5352654bdf2f30b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-manual"

RDEPENDS:${PN} += ""

inherit rpm
