SUMMARY = "MySpell en_GB Dictionary"
DESCRIPTION = "English spelling dictionaries, hyphenation rules, thesaurus, and grammar checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-en_GB-20221012-1.2.noarch.rpm"
RPM_HASH = "4457d245c2dcdd853a19197d21fd6c56c6d21b61ec661273586bedb6aadbac30462188fbfb40f439410245ce87d23de19c945e7b980d3754d530249387f2be85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-en-GB \
locale(libreoffice:en_GB) \
locale(seamonkey-spellchecker:en_GB) \
myspell-british \
myspell-dictionary \
myspell-en_GB"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-en"

inherit rpm
