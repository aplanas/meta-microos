SUMMARY = "MySpell ar_YE Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_YE-20221012-1.2.noarch.rpm"
RPM_HASH = "f0575cb121d6120e6a8cba7109803b8042f38cfaa8802e1a6a5760245f82100cc3be5b56487255b6db2db9a36fffe9aff63e9ca1cac35b145362f24da8444e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-YE \
locale-seamonkey-spellchecker-ar-YE \
myspell-ar-YE \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
