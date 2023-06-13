SUMMARY = "MySpell ro_RO Dictionary"
DESCRIPTION = "rospell Romanian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ro_RO-20221012-1.2.noarch.rpm"
RPM_HASH = "86371e402ec09d676e800feadf540f724e2f0a196297181cfea83e9351fd92e49da7f71805fccd95034cc0548dd9bb76864508a6fd34c5a052c74ac9a0863344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ro_RO) \
locale(seamonkey-spellchecker:ro_RO) \
myspell-dictionary \
myspell-ro_RO"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-ro"

inherit rpm
