SUMMARY = "MySpell ca_ES Dictionary"
DESCRIPTION = "Catalan spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ca_ES-20221012-1.2.noarch.rpm"
RPM_HASH = "7c9da0ca3b1d62754f683ea93b0ea261f5cc3cfeb82a067e3c534cccee274e0a3baf1d47a1391a189352fffdabe4b12fe1bcdf99b0ee00750f9d56c609ca154d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ca_ES) \
locale(seamonkey-spellchecker:ca_ES) \
myspell-ca_ES \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ca \
myspell-dictionaries"

inherit rpm
