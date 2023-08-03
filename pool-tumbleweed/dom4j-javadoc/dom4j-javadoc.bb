SUMMARY = "XML, XPath and XSLT library for Java"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-javadoc-1.6.1-37.1.noarch.rpm"
RPM_HASH = "5a7b2469ee577d2909145254ecdd70c419d7addd6072244dabfe5cabbd582cf36761703b69a94b8127dfd35289dd0593d8b34b5de9be4c41141116b29c53ff80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
