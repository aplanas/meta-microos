SUMMARY = "Documentation for lensfun"
DESCRIPTION = "Documentation and manual files for the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "lensfun-doc-0.3.3-1.8.aarch64.rpm"
RPM_HASH = "1338cffaa12d380695cb6284c146a11ef154091b6fae7b30a9cb48493d1b769e7a8ac97bfc576f7d283e2856bc89875bd27bdb395436118cb520e8ce6aca1ff9"

RPROVIDES:${PN} += "lensfun-doc"

RDEPENDS:${PN} += "lensfun-data"

inherit rpm
