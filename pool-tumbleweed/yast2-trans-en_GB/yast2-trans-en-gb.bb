SUMMARY = "YaST2 - British English Translations"
DESCRIPTION = "YaST2 - Translations for British English."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-en_GB-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "da4a10a6541b2ef7e2c2b75fba52861e2e9b8ef4d8e1a046535ef708b8e37fffe4f8ee2dbbc940b9b7cfe6c44de931f6ad125e4482499fab953312956b78fe19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-en-GB \
yast2-trans-en-GB"

RDEPENDS:${PN} += ""

inherit rpm
