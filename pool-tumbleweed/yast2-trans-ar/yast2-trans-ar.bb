SUMMARY = "YaST2 - Arabic Translations"
DESCRIPTION = "YaST2 - Translations for Arabic."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ar-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "91da497fcc2651182bda14a3e97f22ceab46b739b95dd2a1b947b42f13aa08ed4860dcef08d3cec2daabea0dc9317506e92a9b5991d40f0cdc560cea145a205b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ar \
yast2-trans-ar"

RDEPENDS:${PN} += ""

inherit rpm
