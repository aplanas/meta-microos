SUMMARY = "MySpell en_ZW Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_ZW-20221012-1.2.noarch.rpm"
RPM_HASH = "530975e83f3ee72191db019d15e809aca817ef43c119da0185fed8080f7af04689f77a04a1ac67476c87e6f8fac1236c9fde6512b8a8200a6fa53d650d2c5fa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-ZW \
locale-seamonkey-spellchecker-en-ZW \
myspell-dictionary \
myspell-en-ZW"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US \
myspell-en-ZA"

inherit rpm
