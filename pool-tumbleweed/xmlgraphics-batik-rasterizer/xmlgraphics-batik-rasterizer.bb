SUMMARY = "Batik SVG rasterizer"
DESCRIPTION = "The SVG Rasterizer is a utility that can convert SVG files to a raster \
format. The tool can convert individual files or sets of files, making \
it easy to convert entire directories of SVG files. The supported \
formats are JPEG, PNG, and TIFF, however the design allows new formats \
to be added easily."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-rasterizer-1.15-3.1.noarch.rpm"
RPM_HASH = "95a3f9cc515c87b312ffed03d9c5f559407ed1035176b7a4cd1080cfaf6e4bdf856948b572ccb3d48d57c27785e43c8377623126280aa373b2f4fd3788431e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-rasterizer \
config-xmlgraphics-batik-rasterizer \
mvn-org.apache.xmlgraphics-batik-rasterizer \
mvn-org.apache.xmlgraphics-batik-rasterizer-ext \
mvn-org.apache.xmlgraphics-batik-rasterizer-ext-pom- \
mvn-org.apache.xmlgraphics-batik-rasterizer-pom- \
osgi-org.apache.batik.rasterizer \
osgi-org.apache.batik.rasterizer-ext \
xmlgraphics-batik-rasterizer"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
xmlgraphics-batik"

inherit rpm
