SUMMARY = "MySpell es_ES Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_ES-20221012-1.2.noarch.rpm"
RPM_HASH = "68289e70e4a5bd726218490a365d510147b5b6cc13a02b791afc3d0a3a15feaa77189d469d775320f2fcaf41b0527d2171853fa78d817c116b4397c83a11b34f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_ES) \
locale(seamonkey-spellchecker:es_ES) \
myspell-dictionary \
myspell-es_ES \
myspell-spanish"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
