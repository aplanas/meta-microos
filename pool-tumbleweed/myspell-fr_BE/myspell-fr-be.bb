SUMMARY = "MySpell fr_BE Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-fr_BE-20221012-1.2.noarch.rpm"
RPM_HASH = "28d876f4f55481f4958f1fbf26f90850a8247e19e6ef5227d85797e083aedf6b328a35f932d29087a8245b1d2df995ea021c9a9d024e4ec7fc4c11ce34237db4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:fr_BE) \
locale(seamonkey-spellchecker:fr_BE) \
myspell-dictionary \
myspell-fr_BE"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-fr_FR"

inherit rpm
