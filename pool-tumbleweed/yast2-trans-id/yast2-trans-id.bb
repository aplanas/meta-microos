SUMMARY = "YaST2 - Indonesian Translations"
DESCRIPTION = "YaST2 - Indonesian Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-id-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "cd0611e4111794be40a09669b95699e600dfbcb258804fa473c5c7eeabf37e8902230725d09d27b425ef1e07ce1ac0a900fccfe30ba03888e08162f16201f57c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-id \
yast2-trans-id"

RDEPENDS:${PN} += ""

inherit rpm
