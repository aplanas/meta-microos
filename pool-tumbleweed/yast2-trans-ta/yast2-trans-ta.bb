SUMMARY = "YaST2 - Tamil Translations"
DESCRIPTION = "YaST2 - Tamil translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ta-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "37eaaf5e857fda22987bbc34e8a6a6b6137b7664e127ebe9ca49150114b75a745dda905865e30722b96c9544355fdfb31b984ed89bbfbea5569319845c7cd2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ta \
yast2-trans-ta"

RDEPENDS:${PN} += ""

inherit rpm
