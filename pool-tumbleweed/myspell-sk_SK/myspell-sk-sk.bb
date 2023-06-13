SUMMARY = "MySpell sk_SK Dictionary"
DESCRIPTION = "Slovak spelling dictionary, hyphenation rules, and thesaurus."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-sk_SK-20221012-1.2.noarch.rpm"
RPM_HASH = "495b5a4ad4678403f9157bd53483c14231b083b8450a7c6f0f8bbdb428cdc9ae1f92c2967cb59d26481663cd726ec6082cda4bf49f9ffb2ba98c8145e74fd75f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-thesaurus-sk \
locale(libreoffice:sk_SK) \
locale(seamonkey-spellchecker:sk_SK) \
myspell-dictionary \
myspell-sk_SK \
myspell-slovak"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
