SUMMARY = "MySpell en_IE Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_IE-20221012-1.2.noarch.rpm"
RPM_HASH = "879dfa1f2999e2b750e22ddc452695a5897d128ab9ed5f2a874434c2718e9eeb7bcbfa4dae16ccef48cede3276214bbd97087d5bad3c2be177c2e820c6d2e6e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-IE \
locale-seamonkey-spellchecker-en-IE \
myspell-dictionary \
myspell-en-IE"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
