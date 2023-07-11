SUMMARY = "Batik CSS engine"
DESCRIPTION = "CSS component of the Apache Batik SVG manipulation and rendering library."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-css-1.15-3.1.noarch.rpm"
RPM_HASH = "4b2da074184be47d748062147b5c32a76ec488ac9e5bae78cb69d0837ab0b05f2282798b07079e0aedc65e4c48d0b2c26dc052a5b5c6dd81d9469f25118373a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-css \
mvn-org.apache.xmlgraphics-batik-css \
mvn-org.apache.xmlgraphics-batik-css-pom- \
osgi-org.apache.batik.css \
xmlgraphics-batik-css"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-xml-apis-xml-apis-ext \
xmlgraphics-batik"

inherit rpm
