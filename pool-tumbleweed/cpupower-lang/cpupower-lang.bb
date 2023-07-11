SUMMARY = "Translations for package cpupower"
DESCRIPTION = "Provides translations for the 'cpupower' package."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "cpupower-lang-6.3.9-4.15.noarch.rpm"
RPM_HASH = "f303de47f5f34bdcc3139d5b6210fed9440d8569823b08860912608259bdc4d72d160d1496440a5a08250c6d88fb5027e3cd5d11e3603da9d1645ee538c3c232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpupower-lang \
cpupower-lang-all \
locale-cpupower-cs \
locale-cpupower-de \
locale-cpupower-fr \
locale-cpupower-it \
locale-cpupower-pt"

RDEPENDS:${PN} += "cpupower"

inherit rpm
