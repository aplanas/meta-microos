SUMMARY = "MySpell en_AU Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_AU-20221012-1.2.noarch.rpm"
RPM_HASH = "d8d7e3cf6bd34e648856e33574acd880224754a9bbcf7aa4d13929e6ef1644419856676f61491123e20dcdeb20eb1089f1c1894a288616c1ccf19093f5d34f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-en-AU \
locale-libreoffice-en-AU \
locale-seamonkey-spellchecker-en-AU \
myspell-australian \
myspell-dictionary \
myspell-en-AU"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
