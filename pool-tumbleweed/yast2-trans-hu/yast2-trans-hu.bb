SUMMARY = "YaST2 - Hungarian Translations"
DESCRIPTION = "YaST2 - Hungarian translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-hu-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "12bfb6f5f57bd153e83e34b71093c9e9b81b550bcb08994c70a398ac2e46a57699f21495ef2eca273284a3c839235b282273dbd53214cb683d929d83ae7a791d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hu \
yast2-trans-hu"

RDEPENDS:${PN} += ""

inherit rpm
