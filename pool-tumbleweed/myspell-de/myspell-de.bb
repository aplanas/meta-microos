SUMMARY = "MySpell de Dictionary"
DESCRIPTION = "German (Austria, Germany, Switzerland) spelling dictionaries, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-de-20221012-1.2.noarch.rpm"
RPM_HASH = "c8767cf6c58282deb88d865856319d15730ae2093aa00d237d7632f28d0cb173126755b5ab5e2ab935f8863545fa15c16c6373f535335b3a8c54cb9ea95fb47e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:de) \
locale(seamonkey-spellchecker:de) \
myspell-de \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
