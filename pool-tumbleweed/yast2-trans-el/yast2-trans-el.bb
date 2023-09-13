SUMMARY = "YaST2 - Greek Translations"
DESCRIPTION = "YaST2 - Translations for Greek."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-el-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "79f607487a949277ed478ea607a5498c6bad0924b97cc5f874619bdef59bc1e90a0ec84b68f4c03616b78502f474a460b983212b6f4c2df0f9bb4b3bf5505d53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-el \
yast2-trans-el"

RDEPENDS:${PN} += ""

inherit rpm
