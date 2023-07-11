SUMMARY = "Translations for package dfc"
DESCRIPTION = "Provides translations for the 'dfc' package."
LICENSE = "BSD-3-Clause"

PV = "3.1.1"

RPM_NAME = "dfc-lang-3.1.1-3.1.noarch.rpm"
RPM_HASH = "1bb09cb9e02dbe7f5fd5259ec7a3f217ef25070cdc22384f9fa3d4dc5a0ef95f51ea299bede078019e1861b4a6872483f230692ca01cd455997ce7137b798181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-dfc-lang \
dfc-lang \
dfc-lang-all \
locale-dfc-fr \
locale-dfc-nl"

RDEPENDS:${PN} += "dfc"

inherit rpm
