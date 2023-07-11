SUMMARY = "Batik SVG pretty printer"
DESCRIPTION = "The SVG Pretty Printer lets developers 'pretty-up' their SVG files and \
get their tabulations and other cosmetic parameters in order. It can \
also be used to modify the DOCTYPE declaration on SVG files."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-svgpp-1.15-3.1.noarch.rpm"
RPM_HASH = "c6dae07c7d96ffccbf80b0e2d97adbbf5574fa907e0a2732c737363f30968f09ecd68f1110c82b84d5e7c04ecd43557b3eb25663c5b7fe1773a5b9a822103771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-svgpp \
mvn-org.apache.xmlgraphics-batik-svgpp \
mvn-org.apache.xmlgraphics-batik-svgpp-pom- \
osgi-org.apache.batik.svgpp \
xmlgraphics-batik-svgpp"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
xmlgraphics-batik"

inherit rpm
