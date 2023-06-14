SUMMARY = "MySpell es_HN Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_HN-20221012-1.2.noarch.rpm"
RPM_HASH = "f75525774624e99bab8c97a700951464413532f0d1f6e52dcc43ec60ac7722de5cee2d8f70b39b9c5362210177fc4d6e3267fb6dc9a67c9a7cad9374eb415344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-HN \
locale-seamonkey-spellchecker-es-HN \
myspell-dictionary \
myspell-es-HN \
myspell-spanish-honduran"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
