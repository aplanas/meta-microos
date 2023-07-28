SUMMARY = "YaST2 - Polish Translations"
DESCRIPTION = "YaST2 - Translations for Polish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-pl-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "afa4382216884e47fc5da76689f23ddb5c9f0273a277aa088dc6bc801cd8b1aa336bf22bc05b43652e8cee7b0552fd6558384cf8e63d33d1828cf246db70b62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pl \
yast2-trans-pl"

RDEPENDS:${PN} += ""

inherit rpm
