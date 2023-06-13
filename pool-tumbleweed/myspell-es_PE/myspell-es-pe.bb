SUMMARY = "MySpell es_PE Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_PE-20221012-1.2.noarch.rpm"
RPM_HASH = "28c33e358dc97cb0ef04bae32580a750a76a77df4454804d9a53d1e893f86bd8fe464c90465b5e74aaf4d21e78fa90692d7e8869cde64fcb78e7b717b756389f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_PE) \
locale(seamonkey-spellchecker:es_PE) \
myspell-dictionary \
myspell-es_PE \
myspell-spanish-peruvian"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
