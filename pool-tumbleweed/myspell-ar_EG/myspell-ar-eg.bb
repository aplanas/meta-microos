SUMMARY = "MySpell ar_EG Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_EG-20221012-1.2.noarch.rpm"
RPM_HASH = "3bae0907579f45e0c95584fd0303b85489e22b796e2d805af1964dba81ca4022c5685e1cef604e9462604903225f4ffb199995179a7bab4fbc27bc28a2c42396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_EG) \
locale(seamonkey-spellchecker:ar_EG) \
myspell-ar_EG \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
