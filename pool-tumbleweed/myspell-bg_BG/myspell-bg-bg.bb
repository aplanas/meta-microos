SUMMARY = "MySpell bg_BG Dictionary"
DESCRIPTION = "Bulgarian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-bg_BG-20221012-1.2.noarch.rpm"
RPM_HASH = "22152a1019e31807a27c02a1bfe3e44584cbbb306b517fc383f472527e1baf3d9d2dc3fdefc7763acfee9ad315828aed4a7715c1299716a33e002a80c538dad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-bg \
locale-libreoffice-bg-BG \
locale-seamonkey-spellchecker-bg-BG \
myspell-bg-BG \
myspell-bulgarian \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
