SUMMARY = "YaST2 - Arabic Translations"
DESCRIPTION = "YaST2 - Translations for Arabic."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-ar-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "c491876887b9b79b558e71f3313c5832697714ee3fb621c8909481753f141c75a927835d6c626efce3c79b6bbd9dce2aab2b0eecfa562e6d6a58533a641f87a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ar \
yast2-trans-ar"

RDEPENDS:${PN} += ""

inherit rpm
