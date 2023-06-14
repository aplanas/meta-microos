SUMMARY = "MySpell ar_SD Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_SD-20221012-1.2.noarch.rpm"
RPM_HASH = "49a3612019097db8b739f139b1008fabc59b28bb93923b14ababbd27e0f42ab9af9c6b17d4b642e9672e6d6f10424ea4c49c475e79f09c1911a8369edd52c29c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-SD \
locale-seamonkey-spellchecker-ar-SD \
myspell-ar-SD \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
