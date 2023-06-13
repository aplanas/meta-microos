SUMMARY = "MySpell en_NZ Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_NZ-20221012-1.2.noarch.rpm"
RPM_HASH = "37a9c739aa79dd74b36f99b12e840e6002ea3256da0612b08cef3b1f1a19109e6c1cfd2d5ebc4252eada387d364366d00db20bea83521da674bf0c722ffb55a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:en_NZ) \
locale(seamonkey-spellchecker:en_NZ) \
myspell-dictionary \
myspell-en_NZ \
myspell-new-zaeland"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en \
myspell-en_GB \
myspell-en_US"

inherit rpm
