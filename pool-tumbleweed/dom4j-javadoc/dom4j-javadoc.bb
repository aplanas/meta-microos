SUMMARY = "XML, XPath and XSLT library for Java"
DESCRIPTION = "dom4j is an easy to use Open Source XML, XPath and XSLT framework for \
Java using the Java Collections Framework. dom4j allows you to read, \
write, navigate, create and modify XML documents. dom4j integrates with \
DOM, SAX and JAXP and is seamlessly integrated with full XPath support."
LICENSE = "Apache-1.1"

PV = "1.6.1"

RPM_NAME = "dom4j-javadoc-1.6.1-36.5.noarch.rpm"
RPM_HASH = "72d3d7c35bdd3a316ec58a4a02568892c2d4280de416845d4f509d4c977fc2cbf97dede141cd4a749dd9701680d91b0e05a51227addebbec727c25f8988efd78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dom4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
