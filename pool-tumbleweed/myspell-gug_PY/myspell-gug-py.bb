SUMMARY = "MySpell gug_PY Dictionary"
DESCRIPTION = "Guarani thesaurus and spell checker."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-gug_PY-20221012-1.2.noarch.rpm"
RPM_HASH = "ac7d5aaa0c258038678521d73545f8fe88e87b2caeb0e86bfcfbfc3d94060a1ca4603201744c6efbf88433a6fcb90d506308de8eaa788712b175cfdf99f82d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:gug_PY) \
locale(seamonkey-spellchecker:gug_PY) \
myspell-dictionary \
myspell-gug_PY"

RDEPENDS:${PN} += "myspell-dictionaries \
myspell-gug"

inherit rpm
