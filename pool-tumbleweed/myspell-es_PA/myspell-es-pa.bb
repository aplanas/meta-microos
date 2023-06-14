SUMMARY = "MySpell es_PA Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_PA-20221012-1.2.noarch.rpm"
RPM_HASH = "4ceb81ba393b9f401224718f5f16d4833dbd8f8801c837455a8212203573022dba7ff2e1cabf780e9041a48bf6df6cbda1ebe16e7516f1dac0fb0ec4ba454451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-PA \
locale-seamonkey-spellchecker-es-PA \
myspell-dictionary \
myspell-es-PA \
myspell-spanish-panamanian"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
