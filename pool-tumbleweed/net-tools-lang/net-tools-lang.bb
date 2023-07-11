SUMMARY = "Translations for package net-tools"
DESCRIPTION = "Provides translations for the 'net-tools' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.10"

RPM_NAME = "net-tools-lang-2.10-2.2.noarch.rpm"
RPM_HASH = "7cc1389fcafe84c8310aa01501ca0f71c47b06c856df26f52291d269e5727283ee822e6fbde3aa12e1526600db2b2a326cb1a6128d6824bbf920151b60429b09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-net-tools-cs \
locale-net-tools-de \
locale-net-tools-et \
locale-net-tools-fr \
locale-net-tools-pt-BR \
net-tools-lang \
net-tools-lang-all"

RDEPENDS:${PN} += "net-tools"

inherit rpm
