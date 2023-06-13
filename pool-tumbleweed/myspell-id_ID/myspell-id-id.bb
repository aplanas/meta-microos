SUMMARY = "MySpell id_ID Dictionary"
DESCRIPTION = "Indonesian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-id_ID-20221012-1.2.noarch.rpm"
RPM_HASH = "7e0741b35db33b003c74bca399b16caa952f71735bd4144e631471d974e72385c121966507624d16a1f5304607d1ea195d9e88ebe46272cc81e9fc74f1bed94e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:id_ID) \
locale(seamonkey-spellchecker:id_ID) \
myspell-dictionary \
myspell-id_ID"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-id"

inherit rpm
