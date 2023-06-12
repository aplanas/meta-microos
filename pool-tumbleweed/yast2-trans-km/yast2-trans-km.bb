SUMMARY = "YaST2 - Khmer Translations"
DESCRIPTION = "YaST2 - Translations for Khmer."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-km-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "f3391426f06127e85e6f16a892672aef7dc20ac46f39b994bf716c067da18aac83b3de74a77337fa29ee885f278481c0de6e9860a3dfc27141f1b5509c39e83e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:km) \
yast2-trans-km"
RDEPENDS:${PN} += ""

inherit rpm
