SUMMARY = "YaST2 - Indonesian Translations"
DESCRIPTION = "YaST2 - Indonesian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-id-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "a516d5fde553bfbfb9521d05f9705eae3b41273cf2af6a0c4ab82b8f0aa6935a38fce782bef118982ac1c503582f3b76e11ee89963f00b2fa8f1264c946cc551"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:id) \
yast2-trans-id"
RDEPENDS:${PN} += ""

inherit rpm
