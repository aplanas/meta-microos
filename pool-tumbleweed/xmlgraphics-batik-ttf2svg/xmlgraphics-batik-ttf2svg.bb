SUMMARY = "Batik SVG font converter"
DESCRIPTION = "The SVG Font Converter lets developers convert character ranges from \
the True Type Font format to the SVG Font format to embed in SVG \
documents. This allows SVG document to be fully self-contained be \
rendered exactly the same on all systems."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-ttf2svg-1.15-3.1.noarch.rpm"
RPM_HASH = "41850f09131a0a101c04f57d8e807d9c1f97f144ce2011bdf69ff97444f9ee5097dba81ea38c497f1c50a852063a2347fa215737d30a22742d4cf6ae608b4265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-ttf2svg \
mvn-org.apache.xmlgraphics-batik-ttf2svg \
mvn-org.apache.xmlgraphics-batik-ttf2svg-pom- \
osgi-org.apache.batik.ttf2svg \
xmlgraphics-batik-ttf2svg"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
xmlgraphics-batik"

inherit rpm
