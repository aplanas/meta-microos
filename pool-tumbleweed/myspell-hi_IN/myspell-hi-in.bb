SUMMARY = "MySpell hi_IN Dictionary"
DESCRIPTION = "Hindi spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-hi_IN-20221012-1.2.noarch.rpm"
RPM_HASH = "788d14e3773c35b278bb5aa78f8ff372fe0a380cd77b28d1f0f8ad10dbdc28f0b6ca6275dc98299cce4058308406b104162d50c319ceaac6e4437cdd225fcde1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:hi_IN) \
locale(seamonkey-spellchecker:hi_IN) \
myspell-dictionary \
myspell-hi_IN \
myspell-hindi"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
