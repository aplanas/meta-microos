SUMMARY = "YaST2 - Galician Translations"
DESCRIPTION = "YaST2 - Galician translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-gl-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "158e08e95d9c5604587878aa312f8c6cfeced00fb6dc9f49f1b62e389df341e86aea0c3eae3944fb46eb78d17a12b930049517d526839414cab9244949019e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-gl \
yast2-trans-gl"

RDEPENDS:${PN} += ""

inherit rpm
