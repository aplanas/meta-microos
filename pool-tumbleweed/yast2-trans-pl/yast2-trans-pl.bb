SUMMARY = "YaST2 - Polish Translations"
DESCRIPTION = "YaST2 - Translations for Polish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-pl-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "40ef1809f090e739dbb274804a79b2935d25bcedebe6f7878ccacfee38cf7c3b2426ec658af7aa1e9be7c4c84360bb803159417b62ba06083a4fb9dbc729225b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pl \
yast2-trans-pl"

RDEPENDS:${PN} += ""

inherit rpm
