SUMMARY = "MySpell br_FR Dictionary"
DESCRIPTION = "Breton spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-br_FR-20221012-1.2.noarch.rpm"
RPM_HASH = "ef78fadbffec092f175328ce71432f1408cae161b06f64458f12f5e7f783ed9a35924345698674fe056eb126410854a773d4a535d8f7742d3e88d4681e064bba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:br_FR) \
locale(seamonkey-spellchecker:br_FR) \
myspell-br_FR \
myspell-breton \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
