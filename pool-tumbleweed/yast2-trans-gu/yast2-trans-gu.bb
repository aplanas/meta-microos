SUMMARY = "YaST2 - Gujarati Translations"
DESCRIPTION = "YaST2 - Translations for Gujarati."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-gu-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "48cb749959cec0d5226ceeb337419e8ee75536e5c8ca839c47bcd55960bb81b0000b4eb2b3bd15e8679eba35c93ae4a3d3aa9fb1e945ce3c1d933faf71672ba8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gu \
yast2-trans-gu"

RDEPENDS:${PN} += ""

inherit rpm
