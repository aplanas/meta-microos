SUMMARY = "MySpell ar_SY Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_SY-20221012-1.2.noarch.rpm"
RPM_HASH = "f88404b0eda7d0a868d1acfd3a6a10617d9892e678d1c8722a91fb7812e520edb349f32b59a7b0351be9bab4e2c70c7f60c6ae383b73bff23ee2b1b67cf42a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_SY) \
locale(seamonkey-spellchecker:ar_SY) \
myspell-ar_SY \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
