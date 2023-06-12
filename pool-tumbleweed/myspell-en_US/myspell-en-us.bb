SUMMARY = "MySpell en_US Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_US-20221012-1.2.noarch.rpm"
RPM_HASH = "b5cca99e2140aeeec71b9831a050a60d959a032a2993ec44dfbcfa4562355ed83cfc4be03a5ce8d4959c3fbe718b70c5161332c66e94d015ad13ad0046ba5332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-US \
locale(libreoffice:en_US) \
locale(seamonkey-spellchecker:en_US) \
myspell-american \
myspell-dictionary \
myspell-en_US"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en"

inherit rpm
