SUMMARY = "MySpell kmr_Latn_SY Dictionary"
DESCRIPTION = "Kurdish (Turkey) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-kmr_Latn_SY-20221012-1.2.noarch.rpm"
RPM_HASH = "931749aef012955b63ba1bcd4d0c5dc01d1b2958cee105e68560ef3c944549829d9228b6f956f2f19efd3549938b28323d2da95d44e08e293452e28619ecf3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:kmr_Latn_SY) \
locale(seamonkey-spellchecker:kmr_Latn_SY) \
myspell-dictionary \
myspell-kmr_Latn_SY"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-kmr_Latn"

inherit rpm
