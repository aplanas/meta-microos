SUMMARY = "Batik SVG browser"
DESCRIPTION = "The Squiggle SVG Browser lets you view SVG file, zoom, pan and rotate \
in the content and select text items in the image and much more."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-squiggle-1.15-2.3.noarch.rpm"
RPM_HASH = "62d39e84d67e89c3a04373c9fcbeca2c018bfb881fc498b033e88b7ecd3ae117c62ae56b74162ab764c2e50a4f75e56a936a5746a2a968afe2e8818a2fda8adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-squiggle \
mvn-org.apache.xmlgraphics-batik-squiggle \
mvn-org.apache.xmlgraphics-batik-squiggle-ext \
mvn-org.apache.xmlgraphics-batik-squiggle-ext-pom- \
mvn-org.apache.xmlgraphics-batik-squiggle-pom- \
osgi-org.apache.batik.squiggle \
osgi-org.apache.batik.squiggle-ext \
xmlgraphics-batik-squiggle"

RDEPENDS:${PN} += "/bin/bash \
java-headless \
javapackages-filesystem \
xmlgraphics-batik"

inherit rpm
