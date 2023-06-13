SUMMARY = "MySpell ne_NP Dictionary"
DESCRIPTION = "Nepali spelling dictionary, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ne_NP-20221012-1.2.noarch.rpm"
RPM_HASH = "c35d6f51b70aadba542e044691d387d1cd7c475a3924e7d15c1916e50a70d50426cbbd08f59aab98d8d64fbfe396e7fba3adfbac69de3124dc8c2c4ce3fca357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ne_NP) \
locale(seamonkey-spellchecker:ne_NP) \
myspell-dictionary \
myspell-ne_NP"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
