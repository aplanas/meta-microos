SUMMARY = "YaST2 - Lao Translations"
DESCRIPTION = "YaST2 - Translations for Lao."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-lo-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "1815aa6dd73ccd0ba93a4af47f9ce5a7e688b06bf2251f9ebeaec7da1557ed6ca22f94967b94f3a6e2a9ac8b403f243b62063515dfbfcc828884d689927868a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lo \
yast2-trans-lo"

RDEPENDS:${PN} += ""

inherit rpm
