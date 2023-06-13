SUMMARY = "MySpell ar_DZ Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_DZ-20221012-1.2.noarch.rpm"
RPM_HASH = "87c3e608c23b54f95ba038483913611479528cb9faac8eedf195fd8c8b4d47795515ee2c0fcad2164e7cd40fc2281e8c4c088b8f5eac5c52bfcd8eeb58423662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_DZ) \
locale(seamonkey-spellchecker:ar_DZ) \
myspell-ar_DZ \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
