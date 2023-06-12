SUMMARY = "Batik SVG font converter"
DESCRIPTION = "The SVG Font Converter lets developers convert character ranges from \
the True Type Font format to the SVG Font format to embed in SVG \
documents. This allows SVG document to be fully self-contained be \
rendered exactly the same on all systems."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-ttf2svg-1.15-2.3.noarch.rpm"
RPM_HASH = "82ce1b9a534178f5248573447d180556b0680ccbb1eb693c9c7b32afe24fe9ab571534e39e8a9367f9915e985d4e325f6964da480adb04e7115b498ae4dffdbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-ttf2svg \
mvn(org.apache.xmlgraphics:batik-ttf2svg) \
mvn(org.apache.xmlgraphics:batik-ttf2svg:pom:) \
osgi(org.apache.batik.ttf2svg) \
xmlgraphics-batik-ttf2svg"
RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
xmlgraphics-batik"

inherit rpm
