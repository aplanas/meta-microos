SUMMARY = "MySpell kmr_Latn Dictionary"
DESCRIPTION = "Kurdish (Turkey) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-kmr_Latn-20221012-1.2.noarch.rpm"
RPM_HASH = "6f60e910704d0488e068c90a534b747c73e2ebf00773e97707c008c38431f49dfc7285d6d5be8e6fbd6b4b2f6f3141fdf5098b5e0918d30025048c989f19200d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-kmr-Latn \
locale-seamonkey-spellchecker-kmr-Latn \
myspell-dictionary \
myspell-kmr-Latn"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
