SUMMARY = "MySpell es_CO Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_CO-20221012-1.2.noarch.rpm"
RPM_HASH = "686e0052a271e2ea661d8b3c3368cb5ea13ad481f245a8799f51bffc77077d9ee40073d8e5c198c244951238fbaad450016c1162bce014a1269fa0c1a24c03e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-CO \
locale-seamonkey-spellchecker-es-CO \
myspell-dictionary \
myspell-es-CO \
myspell-spanish-colombian"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
