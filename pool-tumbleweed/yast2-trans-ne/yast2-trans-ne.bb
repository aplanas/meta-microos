SUMMARY = "YaST2 - Nepali Translations"
DESCRIPTION = "YaST2 - Translations for Nepali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-ne-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "318ea57d0df3e26170d12e55247f22a4557753d5c607e44b5ca4f5549f2559e2e19432efc75ff260a2d84b4a7380f9ec556afa6fe312f100793fa1a662b6f861"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ne \
yast2-trans-ne"

RDEPENDS:${PN} += ""

inherit rpm
