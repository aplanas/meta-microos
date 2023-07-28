SUMMARY = "YaST2 - Pashto Translations"
DESCRIPTION = "YaST2 - Translations for Pashto."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ps-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "a4428b602c6f5b9e99d66f74538bf1a5c0b5c609f3e58ef424daa4a4f6cc08742cd7e28f614f6bed355f26520cf22aa1455aaab059890bf70cfc9a5c09acac47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ps \
yast2-trans-ps"

RDEPENDS:${PN} += ""

inherit rpm
