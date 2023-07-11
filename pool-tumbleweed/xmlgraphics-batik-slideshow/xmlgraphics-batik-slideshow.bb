SUMMARY = "Batik SVG slideshow"
DESCRIPTION = "Batik SVG slideshow."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-slideshow-1.15-3.1.noarch.rpm"
RPM_HASH = "27ef88525d05cf73844cd0d0746af25c8026db5114e5504a6cf8ba044b911d06392c933f2f5b994902cbdb4a3e08489f42e4f80c86a22612ad0927573c471523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-slideshow \
mvn-org.apache.xmlgraphics-batik-slideshow \
mvn-org.apache.xmlgraphics-batik-slideshow-pom- \
osgi-org.apache.batik.slideshow \
xmlgraphics-batik-slideshow"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
xmlgraphics-batik"

inherit rpm
