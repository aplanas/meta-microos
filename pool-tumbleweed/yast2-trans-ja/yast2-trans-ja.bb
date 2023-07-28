SUMMARY = "YaST2 - Japanese Translations"
DESCRIPTION = "YaST2 - Japanese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-ja-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "fc06d06f0811b755c5121d698625e01aa9b2c712ce295ec07f86a4d1c17d3f34f5971835839407bb89c30f0043f49e7fe1fbad83ffea19c6a5b6e1e2a9d91acb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ja \
yast2-trans-ja"

RDEPENDS:${PN} += ""

inherit rpm
