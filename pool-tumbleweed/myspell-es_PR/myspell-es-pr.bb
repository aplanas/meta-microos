SUMMARY = "MySpell es_PR Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_PR-20221012-1.2.noarch.rpm"
RPM_HASH = "d1c7592c568656563fbee590ab07f23510accc1fdd3078d3c21b15db800acb2f4c6e4ec9376f0ed86b2919a4bdfa716d717ff2cd169f014062843af2ab6d99e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-PR \
locale-seamonkey-spellchecker-es-PR \
myspell-dictionary \
myspell-es-PR \
myspell-spanish-puerto-rican"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
