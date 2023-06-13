SUMMARY = "YaST2 - Kabyle Translations"
DESCRIPTION = "YaST2 - Translations for Kabyle."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-kab-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "0df5531fb8c45d7bd3c2cd2f22e9d38b6affbd01dbe8042b06f1f37cefd955cf8b578c759442da5dc7508a434dbd0bff7194aab1d6942fd13bd6532d03d5f5ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:kab) \
yast2-trans-kab"

RDEPENDS:${PN} += ""

inherit rpm
