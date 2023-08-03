SUMMARY = "YaST2 - Vietnamese Translations"
DESCRIPTION = "YaST2 - Translations for Vietnamese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-vi-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "bdb099da624bef866afe80c7f1a7266e126c49e96417949c29f03f0183b2818eb245c687aca03cddb39add9c22fb0053104504a8f06623756d9b822daa1b4a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-vi \
yast2-trans-vi"

RDEPENDS:${PN} += ""

inherit rpm
