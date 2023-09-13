SUMMARY = "YaST2 - Polish Translations"
DESCRIPTION = "YaST2 - Translations for Polish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-pl-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "8e7df24f7685466b590e574595b83717bb75d54a7b535394b4c4fe406c06a7d32b769a38d7b20506fed4d24541aadd16e4669b3f9edb392112cc58d91a9ebe05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pl \
yast2-trans-pl"

RDEPENDS:${PN} += ""

inherit rpm
