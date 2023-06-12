SUMMARY = "MySpell sw_TZ Dictionary"
DESCRIPTION = "Swahili spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sw_TZ-20221012-1.2.noarch.rpm"
RPM_HASH = "870b3801bb40ae8de4ebec7668dbf3dd8fe0ecef9469953363750ddfdbe31bcfb6156e96258eb324b75a6be8d2810fe7ad21a0221582bd83db8dd6f4fb72c571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:sw_TZ) \
locale(seamonkey-spellchecker:sw_TZ) \
myspell-dictionary \
myspell-kiswahili \
myspell-sw_TZ"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
