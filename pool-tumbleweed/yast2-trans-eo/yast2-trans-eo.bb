SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Esperanto Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-eo-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "fe1543828526ac6324a14f9e50354c3c607c66d5294b46f2cd3b901d6083a3105c247618eff0fe743c4692a51af656961c2e31f94896d8cce964d847a79a787a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eo \
yast2-trans-eo"

RDEPENDS:${PN} += ""

inherit rpm
