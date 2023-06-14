SUMMARY = "MySpell gug Dictionary"
DESCRIPTION = "Guarani thesaurus and spell checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-gug-20221012-1.2.noarch.rpm"
RPM_HASH = "29ab539a8add8fabe2cf7e3f2bf3ac257fae7e651d1e1d63d69eb0a94620d7e7fe7da7545ec9ab96317302b57b713078783caaca63bc6ce16163841c033d7228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-gug \
locale-seamonkey-spellchecker-gug \
myspell-dictionary \
myspell-gug"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
