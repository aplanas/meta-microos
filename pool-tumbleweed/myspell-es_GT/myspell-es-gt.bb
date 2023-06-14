SUMMARY = "MySpell es_GT Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_GT-20221012-1.2.noarch.rpm"
RPM_HASH = "5a05e3e5762aa12fe12e01be2ee9fd01060310b37981d3c3efcec11256ea1dab7adec22ab0e3ccca0480e6aa4ba7f01cfaf38bfc41362c54878f56f32f8cc1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-es-GT \
locale-seamonkey-spellchecker-es-GT \
myspell-dictionary \
myspell-es-GT \
myspell-spanish-guatemalan"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
