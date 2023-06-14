SUMMARY = "MySpell lo_LA Dictionary"
DESCRIPTION = "Lao spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-lo_LA-20221012-1.2.noarch.rpm"
RPM_HASH = "bc44a4f19ddbd2176b33117c1ff22651ca4cb25b38f85d6e7db3a982f5b809b07c8f253db58cde93097546dc356997f2d6ef6824f43e250b102b0bc91ca9f7d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-lo-LA \
locale-seamonkey-spellchecker-lo-LA \
myspell-dictionary \
myspell-lo-LA"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
