SUMMARY = "MySpell gl Dictionary"
DESCRIPTION = "Galician spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-gl-20221012-1.2.noarch.rpm"
RPM_HASH = "4dd97494f82b661740f7ce66c8ddfc1f02253f80ae38153c4ce9f6a781b391a0685fec7b4897cf4cbf9e9a75264296dabf123124ce7f0c3dc6a1f17455cccaa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:gl) \
locale(seamonkey-spellchecker:gl) \
myspell-dictionary \
myspell-galician \
myspell-gl"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
