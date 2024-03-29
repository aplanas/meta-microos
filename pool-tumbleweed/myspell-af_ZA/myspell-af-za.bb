SUMMARY = "MySpell af_ZA Dictionary"
DESCRIPTION = "Afrikaans spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-af_ZA-20221012-1.2.noarch.rpm"
RPM_HASH = "e64c48ac7d7ba72267bfeda7c7501da64e88fb86b224485659b6ec5d6704a36a235777f962748529edaa85551daae8c952da80db7e4b691a2166846f347b14c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-af-ZA \
locale-seamonkey-spellchecker-af-ZA \
myspell-af-ZA \
myspell-african \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
