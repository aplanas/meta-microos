SUMMARY = "YaST2 - Albanian Translations"
DESCRIPTION = "YaST2 - Translations for Albanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-sq-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "556486883d0d165ce5c6a147c623a1150cc22ff2958809248f5ec3c1efb9d31f1747d544f414f034efca703ed2c6449373368485aa518e802099029ea2fb152e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sq \
yast2-trans-sq"

RDEPENDS:${PN} += ""

inherit rpm
