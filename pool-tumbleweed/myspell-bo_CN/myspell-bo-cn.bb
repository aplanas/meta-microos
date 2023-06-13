SUMMARY = "MySpell bo_CN Dictionary"
DESCRIPTION = "Classical Tibetan syllable spellchecker for Hunspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-bo_CN-20221012-1.2.noarch.rpm"
RPM_HASH = "e6b8e1cbeb08ebc1840ff2a10bda97220ff3d91e8994bb517b25eb227393a0c8adebaf55006d3f47adf372ac5d7ead6457d66dc8072792b8f0d6472e59261048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:bo_CN) \
locale(seamonkey-spellchecker:bo_CN) \
myspell-bo_CN \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-bo \
myspell-dictionaries"

inherit rpm
