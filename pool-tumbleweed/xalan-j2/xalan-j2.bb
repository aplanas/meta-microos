SUMMARY = "Java XSLT processor"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program."
LICENSE = "Apache-2.0"

PV = "2.7.2"

RPM_NAME = "xalan-j2-2.7.2-12.7.noarch.rpm"
RPM_HASH = "06d166f33a53f31caf5f86c96c766c3a817d0a0fb630be7496e2037fed963bd6d8e169855a5019c489f4900cf664e8a0809251823336b5522d154b59ebf72396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xalan-j2 \
jaxp-transform-impl \
mvn-xalan-serializer \
mvn-xalan-serializer-pom- \
mvn-xalan-xalan \
mvn-xalan-xalan-pom- \
osgi-org.apache.xalan \
osgi-org.apache.xml.serializer \
xalan-j2"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
jaxp-parser-impl \
mvn-xml-apis-xml-apis \
osgi-org.apache.xerces \
update-alternatives"

inherit rpm
