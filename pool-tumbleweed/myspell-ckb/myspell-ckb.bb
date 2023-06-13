SUMMARY = "MySpell ckb Dictionary"
DESCRIPTION = "Central Kurdish (Sorani) spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ckb-20221012-1.2.noarch.rpm"
RPM_HASH = "261bb79748b4d51f329d45d61d9b2fd931e2ffca3fa17eb130d654e170e3816f4d9dfa8366cbd7ee08b506cee78fda0ffa4b08c1bc118b8d1d9ec772d21f685e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ckb) \
locale(seamonkey-spellchecker:ckb) \
myspell-ckb \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
