SUMMARY = "YaST2 - Polish Translations"
DESCRIPTION = "YaST2 - Translations for Polish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-pl-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "2b515a8e70ae93bed8eb117d52cd9e3cf03fcb2e5b6f7d3e3415891bc34579628678c6b07f1243ccfbd0f8049d273e2a71de014941f1f48b999934a08ed42481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pl \
yast2-trans-pl"

RDEPENDS:${PN} += ""

inherit rpm
