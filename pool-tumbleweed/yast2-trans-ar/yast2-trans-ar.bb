SUMMARY = "YaST2 - Arabic Translations"
DESCRIPTION = "YaST2 - Translations for Arabic."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ar-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "7e5e9160aabb7c9e730cf3402723e0829674067e705344fa29d2ec7957fbb144a0955ab5e130fb5bab2f04aa3761948720dab60c03bfb2edbaec3d49431e47fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:ar) \
yast2-trans-ar"
RDEPENDS:${PN} += ""

inherit rpm
