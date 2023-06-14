SUMMARY = "MySpell es_AR Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_AR-20221012-1.2.noarch.rpm"
RPM_HASH = "69c5c6e060bc40f71a3b800443cc75ed11bc9c93ea40098058447f5369bcfd20a01144084f978d9d5929573d46cdf33785f6266a237d88c2fab2ffcf593f9fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-AR \
locale-seamonkey-spellchecker-es-AR \
myspell-dictionary \
myspell-es-AR \
myspell-spanish-argentine"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
