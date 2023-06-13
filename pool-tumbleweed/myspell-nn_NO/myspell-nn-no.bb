SUMMARY = "MySpell nn_NO Dictionary"
DESCRIPTION = "Norwegian (Nynorsk and Bokmål) spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-nn_NO-20221012-1.2.noarch.rpm"
RPM_HASH = "e5b6ba64fc869024aacd1da4423e405407462f8368106d192269dd9c78b4a8e1cc4a6ab7e333f28ab640b12c30973931c94793ce40104bbfd4fc28855bd2419a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:nn_NO) \
locale(seamonkey-spellchecker:nn_NO) \
myspell-dictionary \
myspell-nn_NO \
myspell-norsk-nynorsk"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-no"

inherit rpm
