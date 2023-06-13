SUMMARY = "MySpell fr_LU Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-fr_LU-20221012-1.2.noarch.rpm"
RPM_HASH = "df27fdd928adf7f2ff587f83896cbbaa58419ff57ea30ea176e82921888e089c7c6f3eaad10869d1ab06ec83c6eee3031d142ef86ef9acf6a6654d2051f49304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:fr_LU) \
locale(seamonkey-spellchecker:fr_LU) \
myspell-dictionary \
myspell-fr_LU"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-fr_FR"

inherit rpm
