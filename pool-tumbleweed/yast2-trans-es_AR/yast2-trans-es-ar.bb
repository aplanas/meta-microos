SUMMARY = "YaST2 - Spanish (Argentina) Translations"
DESCRIPTION = "YaST2 - Spanish (Argentina) Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-es_AR-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "f3c97b3525b998f47e790184edfcb1a6bdbb6c265ff6529b6bd82f9a8e0227e6e9ff522dc4691197b83f4cacb7fd1acb5e838baa4db03043502d1d31d324fe1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es-AR \
yast2-trans-es-AR"

RDEPENDS:${PN} += ""

inherit rpm
