SUMMARY = "MySpell bn_BD Dictionary"
DESCRIPTION = "Bengali spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-bn_BD-20221012-1.2.noarch.rpm"
RPM_HASH = "0f64fcf6611b5e07e9f4399ae471c242514e18a63df23af518045f19c333dab5b590456642878c912936a34e9267329dcddf93f56a0c3219081fca82bbd3a333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:bn_BD) \
locale(seamonkey-spellchecker:bn_BD) \
myspell-bengali \
myspell-bn_BD \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
