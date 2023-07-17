SUMMARY = "YaST2 - Spanish Translations"
DESCRIPTION = "YaST2 - Spanish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-es-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "dfc88cf5d07fc13fceaa4879b18e227de093aea862849cc93e94df6aa68634182898e10c2edb09ea8d36260cc156fdb66d4d8a0fb57fafe5f066237f7274c349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es \
yast2-trans-es"

RDEPENDS:${PN} += ""

inherit rpm
