SUMMARY = "MySpell uk_UA Dictionary"
DESCRIPTION = "Ukrainian spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-uk_UA-20221012-1.2.noarch.rpm"
RPM_HASH = "44aea3a2cda4d2b37703324b4c5b9136ad8142561c0b3c4a5c69f8507dfed4b9010b8d280b36e42fdad016c07066252e8e2fd7ec465ccedf10cce545b2e86c5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-uk-UA \
locale-seamonkey-spellchecker-uk-UA \
myspell-dictionary \
myspell-uk-UA \
myspell-ukrainian"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
