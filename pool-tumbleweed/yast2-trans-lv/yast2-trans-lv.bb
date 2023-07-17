SUMMARY = "YaST2 - Latvian Translations"
DESCRIPTION = "YaST2 - Translations for Latvian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-lv-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "adaae7016045b6e8a71d6e362d2f41f027535737ab0c832e1ceff51b0659b9b7e80ff65f7bb27a02eeefc1e8c9e7c8dd734a247de84ee2560bc188934cc88f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lv \
yast2-trans-lv"

RDEPENDS:${PN} += ""

inherit rpm
