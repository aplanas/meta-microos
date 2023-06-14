SUMMARY = "MySpell si_LK Dictionary"
DESCRIPTION = "Sinhala spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-si_LK-20221012-1.2.noarch.rpm"
RPM_HASH = "65bdff857195d1e08194a138f6478008a2139f869001193dfca1eff055e866aafd16ceb5c33aae63d9af54120981f85835c89dbfd8c9044ce1f12e9dab32ff65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-si-LK \
locale-seamonkey-spellchecker-si-LK \
myspell-dictionary \
myspell-si-LK \
myspell-sinhala"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
