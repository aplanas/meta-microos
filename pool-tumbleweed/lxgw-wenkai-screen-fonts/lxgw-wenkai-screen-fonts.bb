SUMMARY = "Chinese font derived from Klee One"
DESCRIPTION = "A Chinese font derived from Fontworks's Klee One."
LICENSE = "OFL-1.1"

PV = "1.300"

RPM_NAME = "lxgw-wenkai-screen-fonts-1.300-1.1.noarch.rpm"
RPM_HASH = "de4cf6bd1e8c559b6724f25fbd0256176131f22993c28d4e47a0d978f7ebff574c6a67f1aff01e4a091069fc0740f3094e5c53f5b7b903729f0eb259257b7140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxgw-wenkai-screen-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
