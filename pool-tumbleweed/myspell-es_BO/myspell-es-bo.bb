SUMMARY = "MySpell es_BO Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_BO-20221012-1.2.noarch.rpm"
RPM_HASH = "82a2e80781bb8946844119c15a15eb63d02fee61ab3b12fc6ad0ea0f1b5192a1192024cb5091197d254a1135ef3a0337af791963e7b9d0ca7f2545930883c220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_BO) \
locale(seamonkey-spellchecker:es_BO) \
myspell-dictionary \
myspell-es_BO \
myspell-spanish-bolivian"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
