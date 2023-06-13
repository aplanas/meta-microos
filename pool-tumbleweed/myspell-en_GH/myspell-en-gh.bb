SUMMARY = "MySpell en_GH Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_GH-20221012-1.2.noarch.rpm"
RPM_HASH = "73afa767a8874b5cb0325afc2215271d965391bac4795a185795deb4d201d7d5c5328b25f800f61fc9078a77f1021dea9778256aff2395e7721309757718a4c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:en_GH) \
locale(seamonkey-spellchecker:en_GH) \
myspell-dictionary \
myspell-en_GH"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en_GB \
myspell-en_US"

inherit rpm
