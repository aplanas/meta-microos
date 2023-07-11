SUMMARY = "XML, XPath and XSLT library for Java"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-demo-1.6.1-36.5.noarch.rpm"
RPM_HASH = "66464099acb7d74024832b0bffae484079d2ed78c59d193b6949fb8c78b088a21189e938aace094e6915187e42690378387cd89421139eff951c59dc489adbba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-demo"

RDEPENDS:${PN} += "/usr/bin/sh \
dom4j"

inherit rpm
