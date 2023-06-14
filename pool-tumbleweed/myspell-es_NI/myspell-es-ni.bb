SUMMARY = "MySpell es_NI Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_NI-20221012-1.2.noarch.rpm"
RPM_HASH = "9c417093b9b76dbce3548b8fd8ab4992bb6371fde885d9f8823b1b65facf88c5591e4a23769d37e5fe35c0d0f50fef4e53f5d963066640d89dc82a8fd51f5aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-NI \
locale-seamonkey-spellchecker-es-NI \
myspell-dictionary \
myspell-es-NI \
myspell-spanish-nicaraguan"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
