SUMMARY = "YaST2 - Italian Translations"
DESCRIPTION = "YaST2 - translations for Italian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-it-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "1332f7dab8eb110cc5fa76b75e80a2155eb75f7002096d4f4a740b212fb8fcf2b59a17a38d84161282157e5f281f827f6066efedef60111bafc12b1ce702e399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:it) \
yast2-trans-it"

RDEPENDS:${PN} += ""

inherit rpm
