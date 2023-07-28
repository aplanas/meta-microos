SUMMARY = "YaST2 - Estonian Translations"
DESCRIPTION = "YaST2 - Translations for Estonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-et-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "ad75db11ec28ea74d17000823ee8cad7e7a1d83e9ba45d5ea571dc57f51f08e343918a1f60b3c97655e0be9d54a4867cc1da5442433cb6688963ad22c1738f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-et \
yast2-trans-et"

RDEPENDS:${PN} += ""

inherit rpm
