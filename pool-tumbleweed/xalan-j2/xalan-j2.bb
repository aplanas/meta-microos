SUMMARY = "Java XSLT processor"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program."
LICENSE = "Apache-2.0"

PV = "2.7.2"

RPM_NAME = "xalan-j2-2.7.2-12.6.noarch.rpm"
RPM_HASH = "263c496605279c51359ef672e2455ed0b95d606a7f0ad06856f59246d47f9860dafa8641f5e3eac6f48555c32e90a41961b754e8b8bf7fb788056e79236f6c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xalan-j2) \
jaxp_transform_impl \
mvn(xalan:serializer) \
mvn(xalan:serializer:pom:) \
mvn(xalan:xalan) \
mvn(xalan:xalan:pom:) \
osgi(org.apache.xalan) \
osgi(org.apache.xml.serializer) \
xalan-j2"
RDEPENDS:${PN} += "/bin/sh \
java-headless \
javapackages-filesystem \
jaxp_parser_impl \
mvn(xml-apis:xml-apis) \
osgi(org.apache.xerces) \
update-alternatives"

inherit rpm
