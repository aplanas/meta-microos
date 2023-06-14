SUMMARY = "MySpell en_BS Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_BS-20221012-1.2.noarch.rpm"
RPM_HASH = "02b014e25703f7ac55273cac85499bb9c0d221532e8794adc82e0f5dd601a8dfd0d991af6df15450dbe1a6a9734e78b5101e936b79cb58d3b95df53488daa6b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-BS \
locale-seamonkey-spellchecker-en-BS \
myspell-dictionary \
myspell-en-BS"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
