SUMMARY = "YaST2 - Khmer Translations"
DESCRIPTION = "YaST2 - Translations for Khmer."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-km-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "87c4976a19d8b29f8b355f8ff311aed68e6a0ed83b2a1c7acd3ec33129ba71a1b287ff4b705b9ab9ef368b920c9ff6c01318e220999540583b68c94869d03646"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-km \
yast2-trans-km"

RDEPENDS:${PN} += ""

inherit rpm
