SUMMARY = "MySpell en_ZA Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_ZA-20221012-1.2.noarch.rpm"
RPM_HASH = "921b8ad8c6f6496c5f4871b84dcb7e213ef105f1fd025478ccfa15ce20c473fbc8ba445ec0326884d67a02089e90dfda9bbdda6d063e327d5efaa1d9180e88f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-en-ZA \
locale-seamonkey-spellchecker-en-ZA \
myspell-dictionary \
myspell-en-ZA \
myspell-south-african-english"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en-GB \
myspell-en-US"

inherit rpm
