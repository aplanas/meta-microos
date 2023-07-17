SUMMARY = "YaST2 - Low Saxonian Translations"
DESCRIPTION = "YaST2 - Translations for Low Saxonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-nds-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "55471151ade94c4241c6b44250230b72551be07f88f3a55b2ff8faaf2a0aed320f139b2f2ae24c202d79d3e8a0722514fbeb6eb7d2a74e4c1d8b9d8a607270bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nds \
yast2-trans-nds"

RDEPENDS:${PN} += ""

inherit rpm
