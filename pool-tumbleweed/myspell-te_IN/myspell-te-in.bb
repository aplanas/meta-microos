SUMMARY = "MySpell te_IN Dictionary"
DESCRIPTION = "Telugu spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-te_IN-20221012-1.2.noarch.rpm"
RPM_HASH = "fc04f7b80e5d2a218342399fbb51c6d4e7dba4baa2979a873301197d75aef34f27b969104a2650088fe6d20308fbf38322e59cae28606fcad312ba84824aa09b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:te_IN) \
locale(seamonkey-spellchecker:te_IN) \
myspell-dictionary \
myspell-te_IN"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
