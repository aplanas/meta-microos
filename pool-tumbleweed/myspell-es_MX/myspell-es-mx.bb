SUMMARY = "MySpell es_MX Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_MX-20221012-1.2.noarch.rpm"
RPM_HASH = "bcf032007142179b30793b5e40f44521acd6221752b70be17bee505170bf509998b9e5fad8c8a65b5c1940372201928b76538953a127eb968bb1c8bb77a6e3cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-MX \
locale-seamonkey-spellchecker-es-MX \
myspell-dictionary \
myspell-es-MX \
myspell-mexican"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
