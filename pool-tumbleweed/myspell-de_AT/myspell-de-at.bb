SUMMARY = "MySpell de_AT Dictionary"
DESCRIPTION = "German (Austria, Germany, Switzerland) spelling dictionaries, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-de_AT-20221012-1.2.noarch.rpm"
RPM_HASH = "a22700c26a5ad84eedd5c4a4fa37ddb25f6b9e41baadca9e89ac00e425d6d39168edd7b7bb138f2be1fb5cbc1174c7c239aa55c1a444cc90392cc91d4f1c0f8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:de_AT) \
locale(seamonkey-spellchecker:de_AT) \
myspell-austrian \
myspell-de_AT \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-de \
myspell-de_DE \
myspell-dictionaries"

inherit rpm
