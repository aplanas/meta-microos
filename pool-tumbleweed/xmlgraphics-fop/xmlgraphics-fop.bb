SUMMARY = "Formatter for Printing XSLT Processed XML Files"
DESCRIPTION = "FOP (Formatting Objects Processor) is driven by XSL formatting objects \
(XSL-FO). It is a Java application that reads a formatting object (FO) \
tree and renders the resulting pages to one of the following output \
formats: PDF (primary output target), PCL, PS, SVG, XML (area tree \
representation), Print, AWT, MIF, and TXT."
LICENSE = "Apache-2.0"

PV = "2.8"

RPM_NAME = "xmlgraphics-fop-2.8-1.2.noarch.rpm"
RPM_HASH = "9c955d67649e74f9962a14fb1cd9f28ca08f8113a5f74f2a62f324962aa33aca7f2e0ccaa382d3c481a42b552190bdd1d3d667ba4231cefce0af77cd1e6491b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(xmlgraphics-fop) \
fo-formatter \
fop \
mvn(org.apache.xmlgraphics:fop) \
mvn(org.apache.xmlgraphics:fop:pom:) \
xmlgraphics-fop"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem \
mvn(com.thoughtworks.qdox:qdox) \
mvn(commons-io:commons-io) \
mvn(commons-logging:commons-logging) \
mvn(javax.servlet:servlet-api) \
mvn(org.apache.pdfbox:fontbox) \
mvn(org.apache.xmlgraphics:batik-anim) \
mvn(org.apache.xmlgraphics:batik-awt-util) \
mvn(org.apache.xmlgraphics:batik-bridge) \
mvn(org.apache.xmlgraphics:batik-extension) \
mvn(org.apache.xmlgraphics:batik-gvt) \
mvn(org.apache.xmlgraphics:batik-transcoder) \
mvn(org.apache.xmlgraphics:xmlgraphics-commons) \
xml-commons-apis"

inherit rpm
