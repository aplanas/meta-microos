SUMMARY = "MySpell sr_Latn_RS Dictionary"
DESCRIPTION = "Serbian (Cyrillic and Latin) spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sr_Latn_RS-20221012-1.2.noarch.rpm"
RPM_HASH = "409a210d4eb6a71c81d23a35375939d14733b98d76619013dab6eb34f9b451d35bf43295fe6915ab76e45bf7ceac7dc858766b09c4ae2247b9d681c124c82f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-sr-Latn-RS \
locale-seamonkey-spellchecker-sr-Latn-RS \
myspell-dictionary \
myspell-sr-Latn-RS"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-sr"

inherit rpm
