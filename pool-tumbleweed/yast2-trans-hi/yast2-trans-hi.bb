SUMMARY = "YaST2 - Hindi Translations"
DESCRIPTION = "YaST2 - Translations for Hindi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-hi-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "b955c3dcd60a06dc04fdeb7537e241ba40f916b7b69aea561c80a711688ab39642e8bc0d4fac14152fb17f2b39386fd32da56e30fa8d7f74f46ce2c600488a3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-hi \
yast2-trans-hi"

RDEPENDS:${PN} += ""

inherit rpm
