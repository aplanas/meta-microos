SUMMARY = "Open Source XML framework for Java - demo"
DESCRIPTION = "dom4j is an Open Source XML framework for Java. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM and SAX and is seamlessly integrated with full XPath support."
LICENSE = "BSD-3-Clause"

PV = "2.1.4"

RPM_NAME = "dom4j-demo-2.1.4-1.1.noarch.rpm"
RPM_HASH = "e90f7033399c174f938eb09d54b17f273ea6f34f0dcf4966c52bbf2282fd64aa6df350223774631eda04656223edea458eebc220adebd87e10ff1d63d75181d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-demo"

RDEPENDS:${PN} += "dom4j"

inherit rpm
