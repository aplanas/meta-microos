SUMMARY = "MySpell bn_IN Dictionary"
DESCRIPTION = "Bengali spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-bn_IN-20221012-1.2.noarch.rpm"
RPM_HASH = "ae94d672cbeb78d994c3f858e7e21e9b1d924864c265d7f321c80cc32a1dd4ce7896a146931ab1e4627ec3b2480ebdcb8b554ea10ee760f746a2bebad1526662"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-bn-IN \
locale-seamonkey-spellchecker-bn-IN \
myspell-bn-IN \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-bn-BD \
myspell-dictionaries"

inherit rpm
