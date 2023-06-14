SUMMARY = "MySpell oc_FR_lengadoc Dictionary"
DESCRIPTION = "Occitan spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-oc_FR_lengadoc-20221012-1.2.noarch.rpm"
RPM_HASH = "81505a8c1fc84712279c5a88390954662333b483eedabd3c5d7de87bddc6b156390a0945c80b57782232d0f183e5f4d8a4ffa3b7e4b92a7f501a23ff05ef20a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-oc-FR-lengadoc \
locale-seamonkey-spellchecker-oc-FR-lengadoc \
myspell-dictionary \
myspell-oc-FR-lengadoc"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-oc-FR"

inherit rpm
