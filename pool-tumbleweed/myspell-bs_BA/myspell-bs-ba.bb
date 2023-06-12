SUMMARY = "MySpell bs_BA Dictionary"
DESCRIPTION = "Bosnian spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-bs_BA-20221012-1.2.noarch.rpm"
RPM_HASH = "fe3fb15ae99a3f2f7f8fd93a223ef59c5e46d30d6536ae7cb004ab02622a79d73645400a7eebb4c01a8f746f63b2fcad75c45740b4c47856126cacf4727165b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:bs_BA) \
locale(seamonkey-spellchecker:bs_BA) \
myspell-bs_BA \
myspell-dictionary"
RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
