SUMMARY = "MySpell id Dictionary"
DESCRIPTION = "Indonesian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-id-20221012-1.2.noarch.rpm"
RPM_HASH = "1103e43bc08a886279dd9531055ef52ab5839620e9bbe565c2ff4316fcf8666a8fc3d4796674589cb2d1bed24956c19c07e5968ac8494af1383316ceaf139839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:id) \
locale(seamonkey-spellchecker:id) \
myspell-dictionary \
myspell-id"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
