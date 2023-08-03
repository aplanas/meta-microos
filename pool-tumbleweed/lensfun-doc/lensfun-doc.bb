SUMMARY = "Documentation for lensfun"
DESCRIPTION = "Documentation and manual files for the lensfun library/database."
LICENSE = "CC-BY-SA-3.0 & LGPL-3.0-only"

PV = "0.3.4"

RPM_NAME = "lensfun-doc-0.3.4-1.1.aarch64.rpm"
RPM_HASH = "8ca024546246f5c9a77aefc488778bee167560dd182b71db2c0e0e5b96bafcf2357dbe9904fd652e0e26d774ce73332469ffee4434933e45866db9f079d64cb9"

RPROVIDES:${PN} += "lensfun-doc"

RDEPENDS:${PN} += "lensfun-data"

inherit rpm
