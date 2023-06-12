SUMMARY = "MySpell es_CU Dictionary"
DESCRIPTION = "Spanish spelling dictionary, hyphenation rules, and thesaurus for all variants of Spanish."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-es_CU-20221012-1.2.noarch.rpm"
RPM_HASH = "ad1a26bbc99f0b0af3138978b0808eea2d869c53cf45d4e37d253eaefc1ad60f48951e5076d019f1ddf01a8b8acb806d2f622d089b7b92bbc7f5c42c82d8b504"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:es_CU) \
locale(seamonkey-spellchecker:es_CU) \
myspell-dictionary \
myspell-es_CU"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-es"

inherit rpm
