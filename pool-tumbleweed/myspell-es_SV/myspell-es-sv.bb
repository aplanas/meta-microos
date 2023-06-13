SUMMARY = "MySpell es_SV Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_SV-20221012-1.2.noarch.rpm"
RPM_HASH = "9c8a52a26ace68c4f2ff52183e95b0537b6118b3065af3a8b36cf64a9704f3341c40db1afae0bad70600b8b9cc15906f5769bc2f67a06cf05f7d2323e84bc73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_SV) \
locale(seamonkey-spellchecker:es_SV) \
myspell-dictionary \
myspell-es_SV \
myspell-spanish-salvadorean"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
