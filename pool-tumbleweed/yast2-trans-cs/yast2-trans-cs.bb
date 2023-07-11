SUMMARY = "YaST2 - Czech Translations"
DESCRIPTION = "YaST2 - Czech translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-cs-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "1257fb33739fbde395311f42d666f7a5f14e48550130f31a9e9337dd90c4ae70e520463f21f871670b5a3d01d1204d262e3639bfc115c7b0ed01051e978cc0a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cs \
yast2-trans-cs"

RDEPENDS:${PN} += ""

inherit rpm
