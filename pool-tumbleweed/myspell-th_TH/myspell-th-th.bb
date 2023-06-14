SUMMARY = "MySpell th_TH Dictionary"
DESCRIPTION = "Thai spelling dictionary."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-th_TH-20221012-1.2.noarch.rpm"
RPM_HASH = "43b1d13bfbb24916bb365ec20c8e4af56559fdb15cdebe895439772fa47a74be8c2fbf922720276ecd31be380237cbfd530473322678026806cfba58f1e159e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-libreoffice-th-TH \
locale-seamonkey-spellchecker-th-TH \
myspell-dictionary \
myspell-th-TH \
myspell-thai"

RDEPENDS:${PN} += "myspell-dictionaries"

inherit rpm
