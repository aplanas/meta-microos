SUMMARY = "MySpell pt_PT Dictionary"
DESCRIPTION = "Portuguese, Portugal spelling and hyphenation dictionaries and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-pt_PT-20221012-1.2.noarch.rpm"
RPM_HASH = "8694bc621d139440a06beabe0dea2f89279fb12b3846848587a5cb832d8eec4cf7770591af79fc22485d8cfada1f45808a498b62b0913d2002e2bffdeed3597b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-pt-PT \
locale-seamonkey-spellchecker-pt-PT \
myspell-dictionary \
myspell-portuguese \
myspell-pt-PT"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
