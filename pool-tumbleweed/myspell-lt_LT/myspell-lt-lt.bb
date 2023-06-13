SUMMARY = "MySpell lt_LT Dictionary"
DESCRIPTION = "Lithuanian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-lt_LT-20221012-1.2.noarch.rpm"
RPM_HASH = "e530695a76b33bb1e27e9089d396cb035fa78194746aa67d65874150d53b7b859260b8c4dc4d010d5748f604cbd65498e47c6378947efc4faba4433d3c6f17a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:lt_LT) \
locale(seamonkey-spellchecker:lt_LT) \
myspell-dictionary \
myspell-lithuanian \
myspell-lt_LT"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
