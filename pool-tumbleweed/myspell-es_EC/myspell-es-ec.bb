SUMMARY = "MySpell es_EC Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_EC-20221012-1.2.noarch.rpm"
RPM_HASH = "e0c4e159ff5d196d6e257cf6c9748bb15af62ff2eb1df44a2e563abde4491cba8bafa2e96d067c836125a8516045441ece342abe758a40f42647845fc607f219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-EC \
locale-seamonkey-spellchecker-es-EC \
myspell-dictionary \
myspell-es-EC \
myspell-spanish-ecuadorian"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
