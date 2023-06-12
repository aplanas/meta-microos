SUMMARY = "MySpell fr_FR Dictionary"
DESCRIPTION = "French spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-fr_FR-20221012-1.2.noarch.rpm"
RPM_HASH = "3f0812eb0675ce72a2974c8482771f8e75bef2fdd49169465edc6d3d3b987eeb0a451a7ae196c0868db4a73cf1d3778683b47cfd17296d1605805f74e830f7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-fr \
locale(libreoffice:fr_FR) \
locale(seamonkey-spellchecker:fr_FR) \
myspell-dictionary \
myspell-fr_FR \
myspell-french"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
