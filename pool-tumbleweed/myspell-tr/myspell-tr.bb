SUMMARY = "MySpell tr Dictionary"
DESCRIPTION = "Turkish Spellcheck Dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-tr-20221012-1.2.noarch.rpm"
RPM_HASH = "e264b65c54e8eb9839d2653b798cff11e36072886357e6938d743cd8e2cc98afff45aa615377b7a20167db8e7eb0465540c9b0413f2c18dd96f07ed4d0cbadd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:tr) \
locale(seamonkey-spellchecker:tr) \
myspell-dictionary \
myspell-tr"
RDEPENDS:${PN} += "myspell-dictionaries \
myspell-tr_TR"

inherit rpm
