SUMMARY = "MySpell es_DO Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_DO-20221012-1.2.noarch.rpm"
RPM_HASH = "6b79f948ad91a4f69ff32904903353f4116893d1659ed65480f839fbc5895133a68e1db79e99fcfe6064184956aec0cd58d51c6f52127d6091f80cb1f1d13230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-DO \
locale-seamonkey-spellchecker-es-DO \
myspell-dictionary \
myspell-es-DO \
myspell-spanish-dominican"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
