SUMMARY = "YaST2 - German Translations"
DESCRIPTION = "YaST2 - German translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-de-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "49afdf65163e11edc2ba764c90ac3bb2164782beabc2253acf349b33e2117f8abe462aeb9996fa0a152deedc516c7a207cf94aa7f9494574e98b91c9af28ead0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-de \
yast2-trans-de"

RDEPENDS:${PN} += ""

inherit rpm
