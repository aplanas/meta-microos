SUMMARY = "Batik SVG browser"
DESCRIPTION = "The Squiggle SVG Browser lets you view SVG file, zoom, pan and rotate \
in the content and select text items in the image and much more."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-squiggle-1.15-3.1.noarch.rpm"
RPM_HASH = "72f551120beb246f310a973bdf419dfa29707cc9d918c0b1238f312068462fea9d51adfa0142e600dddfd771f7f0a3dccc127f4beac02febd5cfdaa106d611c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-squiggle \
mvn-org.apache.xmlgraphics-batik-squiggle \
mvn-org.apache.xmlgraphics-batik-squiggle-ext \
mvn-org.apache.xmlgraphics-batik-squiggle-ext-pom- \
mvn-org.apache.xmlgraphics-batik-squiggle-pom- \
osgi-org.apache.batik.squiggle \
osgi-org.apache.batik.squiggle-ext \
xmlgraphics-batik-squiggle"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
xmlgraphics-batik"

inherit rpm
