SUMMARY = "MySpell en Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en-20221012-1.2.noarch.rpm"
RPM_HASH = "a64f18c72f28d7438117f527cb959fc6ac0191a9ad2ee755312045caf1cb09db5e229dd1f251dd861c985b911fe286896d71faf4c41b0ea50a5097b9aa9b3950"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en \
locale-seamonkey-spellchecker-en \
myspell-dictionary \
myspell-en"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
