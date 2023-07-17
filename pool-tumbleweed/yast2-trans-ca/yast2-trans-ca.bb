SUMMARY = "YaST2 - Catalan Translations"
DESCRIPTION = "YaST2 - Catalan translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ca-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "c877f8dc2a78a08a279e90a2765134a4d4045e03f1032e3dfe081ce9bbea759ca83a6d351bbcd75f56b47d490de4701a8ca9ddf58586913d232eca1d783126da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ca \
yast2-trans-ca"

RDEPENDS:${PN} += ""

inherit rpm
