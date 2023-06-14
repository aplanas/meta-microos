SUMMARY = "MySpell es_PY Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_PY-20221012-1.2.noarch.rpm"
RPM_HASH = "c15e5ed27b4b00c5fe21ee3b3b2a907146a174f31b260aeb4b53c3ffc1e5359921b05539557582bada71050d6902267cee94394535e01bd33d7728cac876ae8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-PY \
locale-seamonkey-spellchecker-es-PY \
myspell-dictionary \
myspell-es-PY \
myspell-spanish-paraguayan"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
