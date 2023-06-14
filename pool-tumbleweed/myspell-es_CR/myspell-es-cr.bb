SUMMARY = "MySpell es_CR Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_CR-20221012-1.2.noarch.rpm"
RPM_HASH = "70a88669d29c17ae8ab67854bce6b100dcc2f1bd548e2f952fbfd356224f5d6b7f6fcd78be3104c0d5c0459ff7f11fd5486b3bb6cbb38ae4b555b4af62241194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-CR \
locale-seamonkey-spellchecker-es-CR \
myspell-dictionary \
myspell-es-CR \
myspell-spanish-costa-rican"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
