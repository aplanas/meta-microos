SUMMARY = "MySpell ar_TN Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_TN-20221012-1.2.noarch.rpm"
RPM_HASH = "bc757c82dc37ac27251a30805a4dce5f7fd83c65696de01396846e2ec9ca8d07b2f7d7aa3a75692d7b6eda1371129b615160e3f2a95bad8f1dae542c3fb6c5f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-ar-TN \
locale-seamonkey-spellchecker-ar-TN \
myspell-ar-TN \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
