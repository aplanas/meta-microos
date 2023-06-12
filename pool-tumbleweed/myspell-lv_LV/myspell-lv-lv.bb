SUMMARY = "MySpell lv_LV Dictionary"
DESCRIPTION = "Latvian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-lv_LV-20221012-1.2.noarch.rpm"
RPM_HASH = "4384cecc8c82f4bc48ad774bdcffdc30d5447aed39ddd068b775b2c804f07b4e44866e6728d49a0f2c581a55de365af36bb39ff336ecdcfd6d2c81c88d8a18b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:lv_LV) \
locale(seamonkey-spellchecker:lv_LV) \
myspell-dictionary \
myspell-latvian \
myspell-lv_LV"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
