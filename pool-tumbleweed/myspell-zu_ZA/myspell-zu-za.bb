SUMMARY = "MySpell zu_ZA Dictionary"
DESCRIPTION = "Zulu hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-zu_ZA-20221012-1.2.noarch.rpm"
RPM_HASH = "a512c32354a9358975edf9637da37f81436e687a2c9f8a97abd506e1aacee44c48f306f341d648057061bbb72085a09bcda805bffd9c911c74c1a65e0f595f1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:zu_ZA) \
locale(seamonkey-spellchecker:zu_ZA) \
myspell-dictionary \
myspell-zu_ZA \
myspell-zulu"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
