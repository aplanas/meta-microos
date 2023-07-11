SUMMARY = "YaST2 - Low Saxonian Translations"
DESCRIPTION = "YaST2 - Translations for Low Saxonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-nds-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "d791f75b75e6511a30e28e39ddd2c2be55ddafe554a5b71f4221d1e2bbfbf2e170b894848c827ad92bfc741b1a716886ebdd6492550543e09ed8179680cde3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nds \
yast2-trans-nds"

RDEPENDS:${PN} += ""

inherit rpm
