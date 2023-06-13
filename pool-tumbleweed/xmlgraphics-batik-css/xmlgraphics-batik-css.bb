SUMMARY = "Batik CSS engine"
DESCRIPTION = "CSS component of the Apache Batik SVG manipulation and rendering library."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-css-1.15-2.3.noarch.rpm"
RPM_HASH = "b59916b31613b74ce53ec0913f187834f24bcef360c516725483033a4a33a13a4e955973c1dfa5e79b479dbb87779a8453ac12b96719928035cb7554f5c789e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-css \
mvn(org.apache.xmlgraphics:batik-css) \
mvn(org.apache.xmlgraphics:batik-css:pom:) \
osgi(org.apache.batik.css) \
xmlgraphics-batik-css"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(xml-apis:xml-apis-ext) \
xmlgraphics-batik"

inherit rpm
