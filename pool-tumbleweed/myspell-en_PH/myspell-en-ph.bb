SUMMARY = "MySpell en_PH Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_PH-20221012-1.2.noarch.rpm"
RPM_HASH = "31f04d9ffa63b8fbf022c1600c2c4dba9f36aa7286748de99971ed21f4b7375d0ffd5c70f9800788b4229d82623b271436582a8159061cd73883b00c8678f112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:en_PH) \
locale(seamonkey-spellchecker:en_PH) \
myspell-dictionary \
myspell-en_PH"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en_US"

inherit rpm
