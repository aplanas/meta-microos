SUMMARY = "Java XSLT processor"
DESCRIPTION = "Xalan is an XSLT processor for transforming XML documents into HTML, \
text, or other XML document types. It implements the W3C \
Recommendations for XSL Transformations (XSLT) and the XML Path \
Language (XPath). It can be used from the command line, in an applet or \
a servlet, or as a module in other program."
LICENSE = "Apache-2.0"

PV = "2.7.3"

RPM_NAME = "xalan-j2-2.7.3-1.1.noarch.rpm"
RPM_HASH = "ff899f18995cb67e26d85a72baeffb475c4c525ec58c2acc2e3db94784733cc6a3f556b17439f3432d27ec7693795feb3c22423f9befe9e465b1c316aadab125"
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
osgi-org.apache.xerces \
update-alternatives"

inherit rpm
