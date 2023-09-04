SUMMARY = "YaST2 - Afrikaans Translations"
DESCRIPTION = "YaST2 - Translations for Afrikaans."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-af-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "9767ddd32b50587ddbc9764775c7e39745efd44e8e001c982b57e7359b21786f3a5517844a1628a07980e9c1b1688ef34445eed02fda0bb7cfc590ced0e9ef8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-af \
yast2-trans-af"

RDEPENDS:${PN} += ""

inherit rpm
