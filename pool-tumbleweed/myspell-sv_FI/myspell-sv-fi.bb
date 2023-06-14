SUMMARY = "MySpell sv_FI Dictionary"
DESCRIPTION = "Swedish Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sv_FI-20221012-1.2.noarch.rpm"
RPM_HASH = "1805d6d1a9bd453ae91e25f14d2bf9a5df956d6b8ebb5bbdfc11da695df481c348f7ecb84101b4ea8c24a8fb8f4960632d5a15f7d3b0a593bf5a9f2d74677160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sv-FI \
locale-seamonkey-spellchecker-sv-FI \
myspell-dictionary \
myspell-sv-FI"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-sv-SE"

inherit rpm
