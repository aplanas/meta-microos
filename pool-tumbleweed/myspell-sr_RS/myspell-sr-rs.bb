SUMMARY = "MySpell sr_RS Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sr_RS-20221012-1.2.noarch.rpm"
RPM_HASH = "b3e373afaf9db451333bdc7591ae4c6633f56a065a859a2ab021820d18488733ed38bb04d7e5501f0d212bda1bf71cdbc2ea357c2449ee00ea8e699821299208"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sr-RS \
locale-seamonkey-spellchecker-sr-RS \
myspell-dictionary \
myspell-sr-RS"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-sr"

inherit rpm
