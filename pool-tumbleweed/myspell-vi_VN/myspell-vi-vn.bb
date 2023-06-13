SUMMARY = "MySpell vi_VN Dictionary"
DESCRIPTION = "Vietnamese spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-vi_VN-20221012-1.2.noarch.rpm"
RPM_HASH = "938478a482a33e5df2153f7356f99a7da9a108a795868461444f3d8e9e44bca7de1de824cf6c639f9b8357be74d9f34fdd0efb94a48e2507379eaeaa6dbe41e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:vi_VN) \
locale(seamonkey-spellchecker:vi_VN) \
myspell-dictionary \
myspell-vi_VN"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-vi"

inherit rpm
