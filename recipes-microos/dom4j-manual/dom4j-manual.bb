SUMMARY = "JarJar of dom4j for JBoss"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-manual-1.6.1-36.4.noarch.rpm"
RPM_HASH = "3b0aa886523307c447d95d269c7fe296b1cf1b3504589e5c3382e0655d593f5e72daedf33c7cff78c42f2bafe0b563722d509474ff0fdbea8b8eb27185ca47df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-manual"
RDEPENDS:${PN} += ""

inherit rpm
