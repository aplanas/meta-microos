SUMMARY = "YaST2 - Xhosa Translations"
DESCRIPTION = "YaST2 - Translations for Xhosa."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-xh-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "6711d5ff31e68a46c20a066c18d55014965780e9b82897daf946f2c10a89d6e6344ef87b73d174320afc19ee800d078aa486f35089a50354e842f8e3877c0ac9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-xh \
yast2-trans-xh"

RDEPENDS:${PN} += ""

inherit rpm
