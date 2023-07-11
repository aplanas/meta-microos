SUMMARY = "Formatter for Printing XSLT Processed XML Files"
DESCRIPTION = "FOP (Formatting Objects Processor) is driven by XSL formatting objects \
(XSL-FO). It is a Java application that reads a formatting object (FO) \
tree and renders the resulting pages to one of the following output \
formats: PDF (primary output target), PCL, PS, SVG, XML (area tree \
representation), Print, AWT, MIF, and TXT."
LICENSE = "Apache-2.0"

PV = "2.8"

RPM_NAME = "xmlgraphics-fop-2.8-1.3.noarch.rpm"
RPM_HASH = "ffaea4fee841d92198cc8041ade6b306a778efdfbae5babc61a1f5a4218fc0f2d08d34dcd07acebe8c5664682e6f85f85fa8ddf60858230aacc4d2e9ad65d375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xmlgraphics-fop \
fo-formatter \
fop \
mvn-org.apache.xmlgraphics-fop \
mvn-org.apache.xmlgraphics-fop-pom- \
xmlgraphics-fop"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-commons-io-commons-io \
mvn-commons-logging-commons-logging \
mvn-javax.servlet-servlet-api \
mvn-org.apache.pdfbox-fontbox \
mvn-org.apache.xmlgraphics-batik-anim \
mvn-org.apache.xmlgraphics-batik-awt-util \
mvn-org.apache.xmlgraphics-batik-bridge \
mvn-org.apache.xmlgraphics-batik-extension \
mvn-org.apache.xmlgraphics-batik-gvt \
mvn-org.apache.xmlgraphics-batik-transcoder \
mvn-org.apache.xmlgraphics-xmlgraphics-commons \
xml-commons-apis"

inherit rpm
