SUMMARY = "MySpell hu_HU Dictionary"
DESCRIPTION = "Hungarian spelling dictionary, hyphenation rules, thesaurus, and grammar checker FSF.hu Foundation."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-hu_HU-20221012-1.2.noarch.rpm"
RPM_HASH = "8136fbd136fd7525dc61ce776bfcaaa311c0b93d88cd9421e4ca8e25f0ffa6f2b47e60e698ee338bb02d5d37a4e83a7956a16555678352768a55fb17fb34bf96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-hu \
locale-libreoffice-hu-HU \
locale-seamonkey-spellchecker-hu-HU \
myspell-dictionary \
myspell-hu-HU \
myspell-hungarian"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
