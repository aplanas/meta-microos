SUMMARY = "MySpell no Dictionary"
DESCRIPTION = "Norwegian (Nynorsk and Bokmål) spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-no-20221012-1.2.noarch.rpm"
RPM_HASH = "4e8aac3ccfe53a38eecddf38237ac95bf8227dc9735f7ee9c50d407727a84deba4df610f5f33cc6c1f0b7fb85c06ab9b133f321d56542502baa02fa073bc4fd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-no \
locale-seamonkey-spellchecker-no \
myspell-dictionary \
myspell-no"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
