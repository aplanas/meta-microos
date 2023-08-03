SUMMARY = "YaST2 - Georgian Translations"
DESCRIPTION = "YaST2 - Translations for Georgian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ka-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "e192bd676f5633fdac4b00b32433cafc003fe7dda7ed3520f6ce1effee7f5d3306d3b237463fd5be36995237678864c2c95c8cb11d8610ea5dbde57f6288be9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-ka"

RDEPENDS:${PN} += ""

inherit rpm
