SUMMARY = "YaST2 - Marathi Translations"
DESCRIPTION = "YaST2 - Translations for Marathi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-mr-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "0eb49699fb3e2857ece199f19bf2b0bfb1b26172d7e0213e4803b47821f34822d000846b529b38f4dfc404fcf366ff2e0ff4d6a6a9a274a7003341629baa56d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mr \
yast2-trans-mr"

RDEPENDS:${PN} += ""

inherit rpm
