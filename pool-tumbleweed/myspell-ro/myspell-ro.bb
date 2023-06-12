SUMMARY = "MySpell ro Dictionary"
DESCRIPTION = "rospell Romanian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ro-20221012-1.2.noarch.rpm"
RPM_HASH = "f685bf092da4ec2ccbce95bd5d1422be2892357d5e871189ef4c9d1ac1ce286edba6a333390cad8ff1341dc0b1c4bbf5d4aa2494b2f31227cb32dcd6eadbdf21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-ro \
locale(libreoffice:ro) \
locale(seamonkey-spellchecker:ro) \
myspell-dictionary \
myspell-ro \
myspell-romanian"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
