SUMMARY = "MySpell ca_AD Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ca_AD-20221012-1.2.noarch.rpm"
RPM_HASH = "153f3028d716e425e7456f0c072043eee8f29e1e7df5e567ea7d2f3ad949cbf415341fde3d1c37d8e7360b1e3c1197b007e491d839411cc4c10ac65cfad031b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ca-AD \
locale-seamonkey-spellchecker-ca-AD \
myspell-ca-AD \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ca \
myspell-dictionaries"

inherit rpm
