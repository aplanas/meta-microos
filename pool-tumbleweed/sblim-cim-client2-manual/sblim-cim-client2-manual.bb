SUMMARY = "Manual and sample code for sblim-cim-client2"
DESCRIPTION = "Manual and sample code for sblim-cim-client2."
LICENSE = "EPL-1.0"

PV = "2.2.5"

RPM_NAME = "sblim-cim-client2-manual-2.2.5-7.3.noarch.rpm"
RPM_HASH = "69a38d0be2d3ea9995b7e648922287200976b862e4ff86a5899e41a2d6ded638731a5d4e913aa0ba3ad3b06fbe7460cc0dca149703f7c71b27cfa9f7971be2ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sblim-cim-client2-manual"

RDEPENDS:${PN} += ""

inherit rpm
