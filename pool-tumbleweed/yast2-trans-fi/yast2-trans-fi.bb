SUMMARY = "YaST2 - Finnish Translations"
DESCRIPTION = "YaST2 - Finnish translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-fi-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "6555b28de04b713dd5d50e3fe69c4af49fe614ec6ffa16abd079cf4b03d71e6484d4777fd174ce186dc8852963846aeb32164c43e9129856e0193027c675c0dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-fi \
yast2-trans-fi"

RDEPENDS:${PN} += ""

inherit rpm
