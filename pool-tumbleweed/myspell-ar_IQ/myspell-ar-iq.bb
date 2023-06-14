SUMMARY = "MySpell ar_IQ Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_IQ-20221012-1.2.noarch.rpm"
RPM_HASH = "0a73c77849784b074a9c7044a92ccdf916efc4afede0d9fa6ab63a98b51341d9e256c0e0d6b73957c1731ccd511785fbe1182df501a6b3d07846b93bb0c0f77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-IQ \
locale-seamonkey-spellchecker-ar-IQ \
myspell-ar-IQ \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
