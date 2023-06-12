SUMMARY = "The Thai table for ibus-table"
DESCRIPTION = "ibus-table-thai provides the Thai table for ibus-table. \
ภาษาไทย / Thai"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.13"

RPM_NAME = "ibus-table-thai-1.3.13-2.3.noarch.rpm"
RPM_HASH = "67f78ce363f54b1fddaf7aa9c1c929c60a6b68e7c95e81f974c29e177eca24405fcf3bc286f27415b81a261a0bc474224ecf46134793798aad03ec02086655b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-thai"
RDEPENDS:${PN} += "ibus-table"

inherit rpm
