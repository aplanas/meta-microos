SUMMARY = "XML, XPath and XSLT library for Java"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-demo-1.6.1-36.4.noarch.rpm"
RPM_HASH = "a7e3051e2f4a3448164c145d73ac5a2468cde57ec2a1f3c09ca54f80d23bb7211692186f96863179a18ee9de0ed092823e4378c50b65f0604c602535765451c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-demo"

RDEPENDS:${PN} += "/usr/bin/sh \
dom4j"

inherit rpm
