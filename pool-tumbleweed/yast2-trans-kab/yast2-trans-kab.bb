SUMMARY = "YaST2 - Kabyle Translations"
DESCRIPTION = "YaST2 - Translations for Kabyle."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-kab-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "2946810e615776a4c817f278ef4307db2295412b395e962250d4d62c891fa2d406e8d04e91bf1d15a501fb59f41b423ecd1e71f9cd4a7b0abf679f15afa5df1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-kab \
yast2-trans-kab"

RDEPENDS:${PN} += ""

inherit rpm
