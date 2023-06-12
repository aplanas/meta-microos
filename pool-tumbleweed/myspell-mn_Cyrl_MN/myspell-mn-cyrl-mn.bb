SUMMARY = "MySpell mn_Cyrl_MN Dictionary"
DESCRIPTION = "Mongolian spelling and hyphenation dictionaries."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-mn_Cyrl_MN-20221012-1.2.noarch.rpm"
RPM_HASH = "b1f77be0f51e946cef19ee0d0eb713645294bb23eb72ed42ccdf4f67ba8bc1828a1bc13c6521d6fcf436d01b5537562efe448dffa75c65c522c8a22c4de2977b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:mn_Cyrl_MN) \
locale(seamonkey-spellchecker:mn_Cyrl_MN) \
myspell-dictionary \
myspell-mn_Cyrl_MN"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-mn_MN"

inherit rpm
