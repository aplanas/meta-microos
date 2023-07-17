SUMMARY = "YaST2 - Arabic Translations"
DESCRIPTION = "YaST2 - Translations for Arabic."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ar-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "d7de36f4bb915ad1eee4cb2b66c52839aea6722fbb45d8867a445d8270820e9413436f464fd030b75df03e6718d0a939f210d783de211b3af4db2c1195489876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ar \
yast2-trans-ar"

RDEPENDS:${PN} += ""

inherit rpm
