SUMMARY = "MySpell hr_HR Dictionary"
DESCRIPTION = "Croatian spelling dictionary, and hyphenation rules."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-hr_HR-20221012-1.2.noarch.rpm"
RPM_HASH = "e53413e2173c7b34395b94d635adf60c4eaa28bbbc7ff4342ac35990a25c72f9b88a86218fade2e489f673b9c105a3ec6730df837d35d91ba8b863be785408b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(libreoffice:hr_HR) \
locale(seamonkey-spellchecker:hr_HR) \
myspell-croatian \
myspell-dictionary \
myspell-hr_HR"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
