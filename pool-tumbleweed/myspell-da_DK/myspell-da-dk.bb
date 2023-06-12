SUMMARY = "MySpell da_DK Dictionary"
DESCRIPTION = "Danish spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-da_DK-20221012-1.2.noarch.rpm"
RPM_HASH = "f8fdbb8f098d8d81cd665fb76ceb106591ea6aad041d0e3ba2330405e444d97bff9226e7c451386d19519813a8f9953604a735c2378fc8220ffc26a61b3f1896"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-da \
locale(libreoffice:da_DK) \
locale(seamonkey-spellchecker:da_DK) \
myspell-da_DK \
myspell-danish \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
