SUMMARY = "Documentation files for libnma"
DESCRIPTION = "Documentation files for libnma."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-docs-1.10.6-1.3.noarch.rpm"
RPM_HASH = "3e54bc472c836ca615654ac766a2c119c4a981043c821a14cbef83f3ec50ce2410583c822b3311adabd25ddf258379b5082c2c36d836d00a7117ce219a4cfd9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libnma-docs"

RDEPENDS:${PN} += ""

inherit rpm
