SUMMARY = "MySpell gd_GB Dictionary"
DESCRIPTION = "Scottish Gaelic spell checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-gd_GB-20221012-1.2.noarch.rpm"
RPM_HASH = "9f2c5f8e31ef751e7c1f324bedb1c22e675f6f3c42c9f68afc789d95a8b5ed7abd93f40ec7a97c5072a88052c3afb51200c5c12d20e0cb31ed4b84d8d02898fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:gd_GB) \
locale(seamonkey-spellchecker:gd_GB) \
myspell-dictionary \
myspell-gaelic \
myspell-gd_GB"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
