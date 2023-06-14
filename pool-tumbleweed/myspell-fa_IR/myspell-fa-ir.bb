SUMMARY = "MySpell fa_IR Dictionary"
DESCRIPTION = "Lilak, Persian Spell Checking Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-fa_IR-20221012-1.2.noarch.rpm"
RPM_HASH = "f79aa96fc35a8d89cedb49dcf0e6c6a36c7fcf77579569b3436b3e8d28378f6611d03a212694c7bb33e599ddfe624f526f91d6412625d73db68d88feadcc5fce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-fa-IR \
locale-seamonkey-spellchecker-fa-IR \
myspell-dictionary \
myspell-fa-IR"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
