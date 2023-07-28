SUMMARY = "YaST2 - German Translations"
DESCRIPTION = "YaST2 - German translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-de-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "218c47bab85c1ee1a0cfb619ff89c0cb8a101d52f513f52004389df441b2c07593a00d00a8acd0484eeeffad2d8f30d4e85dee3aba10249759577bf7a093a9cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-de \
yast2-trans-de"

RDEPENDS:${PN} += ""

inherit rpm
