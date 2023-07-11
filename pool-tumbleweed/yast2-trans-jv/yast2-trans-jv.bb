SUMMARY = "YaST2 - Javanese Translations"
DESCRIPTION = "YaST2 - Translations for Javanese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-jv-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "9727e90b367816a96bdbdebc34f9738920c6dc2c9cc94e9951ca3d2e01ebe253aeeaad9bf154f2e87a4b05cd13fa896fcda36cd57c071535fc0cdeca348e58f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-jv \
yast2-trans-jv"

RDEPENDS:${PN} += ""

inherit rpm
