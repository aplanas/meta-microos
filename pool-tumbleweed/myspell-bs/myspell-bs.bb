SUMMARY = "MySpell bs Dictionary"
DESCRIPTION = "Bosnian spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-bs-20221012-1.2.noarch.rpm"
RPM_HASH = "e8c5cea8e488baae3230f1472bd665fa9984f00576bef108c4923b0b402bcc72edb0ec384e418007b4c048c5f6c4dad0c09c6960c455889af91fc73e500258da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:bs) \
locale(seamonkey-spellchecker:bs) \
myspell-bs \
myspell-dictionary"

RDEPENDS:${PN} += "myspell-bs_BA \
myspell-dictionaries"

inherit rpm
