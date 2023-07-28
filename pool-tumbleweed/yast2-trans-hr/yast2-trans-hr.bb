SUMMARY = "YaST2 - Croatian Translations"
DESCRIPTION = "YaST2 - Croatian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-hr-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "e38f172ba6eb5bc824c9d92a14337984e262c7964ffdf664a8b472abcedf75a01da6a2c7e8187ba5b2d35429586a43d05901d574383af50a36b5eb0b92a71f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hr \
yast2-trans-hr"

RDEPENDS:${PN} += ""

inherit rpm
