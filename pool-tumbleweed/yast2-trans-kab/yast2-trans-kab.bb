SUMMARY = "YaST2 - Kabyle Translations"
DESCRIPTION = "YaST2 - Translations for Kabyle."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-kab-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "a968823f3f51ea43c97f1526e76e874a26453c4a7c4d47ceaf133c5a6c6082b6dc179cb5830a95190b511fc90968a34f2017fc5a3431191714ef3a8738f55c15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-kab \
yast2-trans-kab"

RDEPENDS:${PN} += ""

inherit rpm
