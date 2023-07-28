SUMMARY = "YaST2 - Turkish Translations"
DESCRIPTION = "YaST2 - Translations for Turkish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-tr-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "68b372b33f4919bac19266a431ffd933fea4129ab22a8a68570e66f0ba1d53871b2ee7fa38ed1629ea1280a1325ceea9b506d402c7b91bb28010f2640627d317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-tr \
yast2-trans-tr"

RDEPENDS:${PN} += ""

inherit rpm
