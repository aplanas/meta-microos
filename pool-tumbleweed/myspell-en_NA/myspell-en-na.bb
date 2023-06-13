SUMMARY = "MySpell en_NA Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_NA-20221012-1.2.noarch.rpm"
RPM_HASH = "74f7c6874dd71eda2d3c6ff9629cbc0fc644c910dab4d047aabc419973b55e429228eb0eea8ef6fcfcf6fbe6551ff131da8719c738a5ab41113ad52662a31497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:en_NA) \
locale(seamonkey-spellchecker:en_NA) \
myspell-dictionary \
myspell-en_NA"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en_GB \
myspell-en_US \
myspell-en_ZA"

inherit rpm
