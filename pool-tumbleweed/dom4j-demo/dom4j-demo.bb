SUMMARY = "XML, XPath and XSLT library for Java"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-demo-1.6.1-37.1.noarch.rpm"
RPM_HASH = "18e8b681e65157d63cd911b0ddc5bb86f67cb555f59ef4aa63f6e82c6418322a67b2abb0b002e544e77e670d3cef77b9943b3ee4b35d6075cd70750d2e25643d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-demo"

RDEPENDS:${PN} += "/usr/bin/sh \
dom4j"

inherit rpm
