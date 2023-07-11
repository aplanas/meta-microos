SUMMARY = "Java XML parser"
DESCRIPTION = "Xerces2 is an XML parser in the Apache Xerces family. This version is the \
reference implementation of the Xerces Native Interface (XNI), a modular \
framework for building parser components and configurations. \
 \
Xerces2 implements the Document Object Model Level 3 Core and Load/Save W3C \
Recommendations, the XML Inclusions (XInclude) W3C Recommendation, and supports \
OASIS XML Catalogs v1.1. It can parse documents conforming to the XML 1.1 \
Recommendation, except that it does not yet provide an option to enable \
normalization checking as described in section 2.13 of this specification. It \
handles name spaces according to the XML Namespaces 1.1 Recommendation, and \
serializes XML 1.1 documents if the DOM level 3 load/save APIs are in use."
LICENSE = "Apache-2.0 & W3C"

PV = "2.12.2"

RPM_NAME = "xerces-j2-2.12.2-2.7.noarch.rpm"
RPM_HASH = "f70b791b6ba742ae8e227c8e7fb61eff5c8968d3a2ae6b2f98cf4728fff11487f66d18cf06456e566b2d251bfce8eb10c14df5d8a36b665a83bdcc8a062971ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jaxp-parser-impl \
mvn-apache-xerces-j2 \
mvn-apache-xerces-j2-pom- \
mvn-xerces-xerces \
mvn-xerces-xerces-pom- \
mvn-xerces-xercesImpl \
mvn-xerces-xercesImpl-pom- \
mvn-xerces-xmlParserAPIs \
mvn-xerces-xmlParserAPIs-pom- \
osgi-org.apache.xerces \
xerces-j2 \
xerces-j2-scripts"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-xml-apis-xml-apis \
osgi-javax.xml \
osgi-org.apache.xml.resolver \
osgi-org.apache.xml.serializer \
xalan-j2 \
xml-commons-apis \
xml-commons-resolver"

inherit rpm
