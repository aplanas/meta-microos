SUMMARY = "MySpell nl_NL Dictionary"
DESCRIPTION = "Dutch spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-nl_NL-20221012-1.2.noarch.rpm"
RPM_HASH = "5742cab8d968f209b293187a21477c47365d6df0a477200f7056d46ed27dda64a1ededda5d8bd04e9c1af9229e2ad6981502045017abba30a32bcd690cb1cc01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:nl_NL) \
locale(seamonkey-spellchecker:nl_NL) \
myspell-dictionary \
myspell-dutch \
myspell-nl_NL"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
