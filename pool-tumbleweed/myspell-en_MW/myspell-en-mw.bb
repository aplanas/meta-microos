SUMMARY = "MySpell en_MW Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_MW-20221012-1.2.noarch.rpm"
RPM_HASH = "5a1ad24a53fdca2dc24014a266c690b22fd33081b108ce91d45bfc840757a1fdc3477270d378a377583dd080e54988ec7b52c6f007750232de9f79e97ec54591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-MW \
locale-seamonkey-spellchecker-en-MW \
myspell-dictionary \
myspell-en-MW"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US \
myspell-en-ZA"

inherit rpm
