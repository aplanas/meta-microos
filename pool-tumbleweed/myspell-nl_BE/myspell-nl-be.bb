SUMMARY = "MySpell nl_BE Dictionary"
DESCRIPTION = "Dutch spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-nl_BE-20221012-1.2.noarch.rpm"
RPM_HASH = "63ead870978ae89164d423d322f5f746440d2b4954851d0356380d4cf8dbf4277ce21af6d4a3478346096cfb1bdf9c1791f526511efa0e6e19623d7f843c0872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:nl_BE) \
locale(seamonkey-spellchecker:nl_BE) \
myspell-dictionary \
myspell-nl_BE"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-nl_NL"

inherit rpm
