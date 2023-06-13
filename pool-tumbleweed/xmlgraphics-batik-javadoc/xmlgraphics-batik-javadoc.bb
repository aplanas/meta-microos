SUMMARY = "Javadoc for xmlgraphics-batik"
DESCRIPTION = "Javadoc for xmlgraphics-batik."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-javadoc-1.15-2.3.noarch.rpm"
RPM_HASH = "8190a3a58f046e359fe7e8dc38477317553845262da58e68dafca26d93ce40f6d1ea467daf6e644325c9d2833cc6c08d601142f0fa730970b225a93e2af7afd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-javadoc \
xmlgraphics-batik-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
