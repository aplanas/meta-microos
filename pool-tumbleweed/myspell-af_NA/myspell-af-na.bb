SUMMARY = "MySpell af_NA Dictionary"
DESCRIPTION = "Afrikaans spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-af_NA-20221012-1.2.noarch.rpm"
RPM_HASH = "08c706f2433b5221c152c63da4bf5391946388e0a84f7a6de7657e91bb974c57bb0e2f5a44186bed2cba5037a67d815b34717984ca75f1b19368665c79e43605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-af-NA \
locale-seamonkey-spellchecker-af-NA \
myspell-af-NA \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-af-ZA \
myspell-dictionaries"

inherit rpm
