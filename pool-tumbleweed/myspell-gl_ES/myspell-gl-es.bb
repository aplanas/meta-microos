SUMMARY = "MySpell gl_ES Dictionary"
DESCRIPTION = "Galician spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-gl_ES-20221012-1.2.noarch.rpm"
RPM_HASH = "e87f7e47facf864935f3ecc160dc41c9c8bd89f54565a59b9029309716d211587e199b8388f831701972070e72d59cb5866037ffa68b0ef8d4019837db709502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:gl_ES) \
locale(seamonkey-spellchecker:gl_ES) \
myspell-dictionary \
myspell-gl_ES"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-gl"

inherit rpm
