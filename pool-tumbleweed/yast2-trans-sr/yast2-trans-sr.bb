SUMMARY = "YaST2 - Serbian Translations"
DESCRIPTION = "YaST2 - Translations for Serbian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-sr-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "7d56abaeca5d079fb1a3260f8e07857834506d60f586a1d02ee17af29e285939f8f650efb0e3633fb37504921bfa0a59782e9897db5339d200ecda8ea04eb6b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:sr) \
yast2-trans-sr"
RDEPENDS:${PN} += ""

inherit rpm
