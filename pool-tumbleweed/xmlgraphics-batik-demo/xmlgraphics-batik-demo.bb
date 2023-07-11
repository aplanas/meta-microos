SUMMARY = "Demo for xmlgraphics-batik"
DESCRIPTION = "Demonstrations and samples for xmlgraphics-batik."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-demo-1.15-3.1.noarch.rpm"
RPM_HASH = "393945f9e8b827374f8e359d48b18d2a4aaa911818d2aa91ff85eab32e90c0accdf3c29e6aaef8b1cd092250b175b9e80771db3544a76084c60cfda8e6286b85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-demo \
xmlgraphics-batik-demo"

RDEPENDS:${PN} += "xmlgraphics-batik"

inherit rpm
