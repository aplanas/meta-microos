SUMMARY = "YaST2 - Norwegian Bokmål Translations"
DESCRIPTION = "YaST2 - Translations for Norwegian Bokmål."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-nb-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "d5f249c961a41b5cbab754bb3f68f40b3ff48e47d7c747d4d46ef293bd3ffd7d62440e58d3941345847eb4f1521b0d0fccbb5085defd555c698c1f513fedbe38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nb \
yast2-trans-nb"

RDEPENDS:${PN} += ""

inherit rpm
