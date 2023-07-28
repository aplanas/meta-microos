SUMMARY = "YaST2 - Traditional Chinese Translations"
DESCRIPTION = "YaST2 - Translations for Traditional Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-zh_TW-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "41b1deb70fc949799604f262cc422a4c4542cd23da7c34c531abaeb3262ebb66fe1be6a9cb913405b0727b9242e4e8a874e738fa29af49a3d85bf5d16cf228b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-TW \
yast2-trans-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
