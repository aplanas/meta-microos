SUMMARY = "MySpell en_BZ Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_BZ-20221012-1.2.noarch.rpm"
RPM_HASH = "e13acc94ae97f18e43b15326ebc11a64bcdfd69c2ea376534e82d7f1d19790397bae1488d3c703936edcd51df568502a8d6a9d57fe9ab5b7be3ab517891c1e97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:en_BZ) \
locale(seamonkey-spellchecker:en_BZ) \
myspell-dictionary \
myspell-en_BZ"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en_GB \
myspell-en_US"

inherit rpm
