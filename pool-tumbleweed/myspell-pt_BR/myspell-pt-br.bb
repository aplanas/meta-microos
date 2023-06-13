SUMMARY = "MySpell pt_BR Dictionary"
DESCRIPTION = "Spelling, thesaurus, hyphenation and grammar checking tools for Brazilian Portuguese."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-pt_BR-20221012-1.2.noarch.rpm"
RPM_HASH = "ef3f297a4348a2fd66b7623f268e06d04040cffa18baf25629335cbbefa2e1a09f5c1fa894c3e0e9e226e7b45316ded54e26ba8d3f90c6047ccb3b6806e0321a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-pt \
locale(libreoffice:pt_BR) \
locale(seamonkey-spellchecker:pt_BR) \
myspell-brazilian \
myspell-dictionary \
myspell-pt_BR"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
