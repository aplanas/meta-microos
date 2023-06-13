SUMMARY = "MySpell ar_BH Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_BH-20221012-1.2.noarch.rpm"
RPM_HASH = "d3029a873a672c28ec752fe7ddac179f45939013e742d7f9691d4f774b742b923e0d46d1e78b6aa34fc744a641edb3dcb9093ebe91d9ab8dba6068918ec5574c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_BH) \
locale(seamonkey-spellchecker:ar_BH) \
myspell-ar_BH \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
