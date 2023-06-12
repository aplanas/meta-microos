SUMMARY = "MySpell sl_SI Dictionary"
DESCRIPTION = "Slovenian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sl_SI-20221012-1.2.noarch.rpm"
RPM_HASH = "a171b58b736799ebb5006bef33614e601662091e9a91eeee0e5e19056e0020e4a219a6d58115a4bc85bb680959e4d1ac9f4c81f5fcaf878eec751572e259cd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-sl \
locale(libreoffice:sl_SI) \
locale(seamonkey-spellchecker:sl_SI) \
myspell-dictionary \
myspell-sl_SI \
myspell-slovene"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
