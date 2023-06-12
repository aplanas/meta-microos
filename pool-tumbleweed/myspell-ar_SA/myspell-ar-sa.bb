SUMMARY = "MySpell ar_SA Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_SA-20221012-1.2.noarch.rpm"
RPM_HASH = "20e765696ddaed1c07f9085cd5e022667f0d705d3744dc26f04a8d50bfafbef72978534246dc707f4da69ea039ae38831849442d3e21858d29a7729880873206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_SA) \
locale(seamonkey-spellchecker:ar_SA) \
myspell-ar_SA \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
