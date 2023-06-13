SUMMARY = "MySpell ar_OM Dictionary"
DESCRIPTION = "Arabic spelling dictionary, and thesaurus Ayaspell."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-ar_OM-20221012-1.2.noarch.rpm"
RPM_HASH = "c8ed840320daeeb2fa099faea731934d163c9221f067ed06fc9b9d28247ec22543f4cb7f75ae87c965df17c5d7e43c8363862a80c8615feb8a2112b5d9571099"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:ar_OM) \
locale(seamonkey-spellchecker:ar_OM) \
myspell-ar_OM \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-ar \
myspell-dictionaries"

inherit rpm
