SUMMARY = "MySpell eo Dictionary"
DESCRIPTION = "Spelling dictionary, thesaurus, and hyphenator for Esperanto."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-eo-20221012-1.2.noarch.rpm"
RPM_HASH = "f06b3e21041a7b47359e1d7a01ee4c2ec757dc7af0a407ae87d36aecb6e3f4ea63b8e89753d5b55689addf4a614466d307eb031017d375c1f49190b5182978ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:eo) \
locale(seamonkey-spellchecker:eo) \
myspell-dictionary \
myspell-eo"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
