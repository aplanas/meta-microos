SUMMARY = "MySpell fr_CA Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-fr_CA-20221012-1.2.noarch.rpm"
RPM_HASH = "6ccac88060d3e0af4c1c695d378df6465f7a63be748d24247e52830b05d1fa04325e049e15c547af12ac1097cbd6fd1dd02c794dc6a55c5a801ad3c20328e597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:fr_CA) \
locale(seamonkey-spellchecker:fr_CA) \
myspell-dictionary \
myspell-fr_CA"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-fr_FR"

inherit rpm
