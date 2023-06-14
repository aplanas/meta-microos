SUMMARY = "MySpell es_PH Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_PH-20221012-1.2.noarch.rpm"
RPM_HASH = "4fb1a4b7cf7faf731c500b19c12d21f34d3ae68130f19273bd204d553ed05369594247bff8eefe0b807fa73f17ce1840bc8e782f05a89fdcb1cd9f6d8617d969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-PH \
locale-seamonkey-spellchecker-es-PH \
myspell-dictionary \
myspell-es-PH"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
