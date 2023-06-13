SUMMARY = "MySpell bo_IN Dictionary"
DESCRIPTION = "Classical Tibetan syllable spellchecker for Hunspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-bo_IN-20221012-1.2.noarch.rpm"
RPM_HASH = "307b5944637416790623bd22e0acc7fa19a65e49bb48c88ee2fd7812343149c0ec090eaf08a191222ae31ad2cce6d31cb4dbb6b3986cf22b6721e7e0d23526c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:bo_IN) \
locale(seamonkey-spellchecker:bo_IN) \
myspell-bo_IN \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-bo \
myspell-dictionaries"

inherit rpm
