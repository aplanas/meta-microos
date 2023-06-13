SUMMARY = "Batik SVG pretty printer"
DESCRIPTION = "The SVG Pretty Printer lets developers 'pretty-up' their SVG files and \
get their tabulations and other cosmetic parameters in order. It can \
also be used to modify the DOCTYPE declaration on SVG files."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-svgpp-1.15-2.3.noarch.rpm"
RPM_HASH = "54161ea644a34fbf62498d8884b2c7a1cdd396c01d7d1309fef8cc42455c3eeb75557c830eda1ab3b4b150b25ad2275af4d0cf0fc3eec6526e5bf942fbe45697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-svgpp \
mvn(org.apache.xmlgraphics:batik-svgpp) \
mvn(org.apache.xmlgraphics:batik-svgpp:pom:) \
osgi(org.apache.batik.svgpp) \
xmlgraphics-batik-svgpp"

RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
xmlgraphics-batik"

inherit rpm
