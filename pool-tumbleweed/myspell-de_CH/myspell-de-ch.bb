SUMMARY = "MySpell de_CH Dictionary"
DESCRIPTION = "German (Austria, Germany, Switzerland) spelling dictionaries, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-de_CH-20221012-1.2.noarch.rpm"
RPM_HASH = "cd1aa161b9432bf3b3f1085f8e707ea69a4fa2be9ddd785e8f59b73c39f3e64d9cf881ff9ced92bc46776666f5f0d4b3e7bb090cda5455a22788180ffbee6bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:de_CH) \
locale(seamonkey-spellchecker:de_CH) \
myspell-de_CH \
myspell-dictionary \
myspell-nswiss"
RDEPENDS:${PN} += "myspell-de \
myspell-dictionaries"

inherit rpm
