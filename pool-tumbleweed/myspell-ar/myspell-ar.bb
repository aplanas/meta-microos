SUMMARY = "MySpell ar Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar-20221012-1.2.noarch.rpm"
RPM_HASH = "abc38391bd4787b9241abf5ba35021f63889993e3ef39db771ca2d64426a7cabaee743a06185f47bfb93a0a75f3d0e91ce4bde495e6935f21b72dcd651cbe17a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar) \
locale(seamonkey-spellchecker:ar) \
myspell-ar \
myspell-arabic \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
