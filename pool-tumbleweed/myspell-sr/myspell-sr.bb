SUMMARY = "MySpell sr Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sr-20221012-1.2.noarch.rpm"
RPM_HASH = "0d852d3dcad3cb390ecafe713696048c515780dd30fca67d17187199b7bf292526a3ced3796d1dc05ecce73b5372aae5720985d1d1786fc16a154748f3c4ebbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:sr) \
locale(seamonkey-spellchecker:sr) \
myspell-dictionary \
myspell-serbian-cyrillic \
myspell-serbian-latin \
myspell-sr"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
