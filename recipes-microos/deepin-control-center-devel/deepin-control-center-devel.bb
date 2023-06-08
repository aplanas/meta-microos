SUMMARY = "Development tools for deepin-control-center"
DESCRIPTION = "The deepin-control-center-devel package contains the header files and developer \
docs for deepin control center."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.143"

RPM_NAME = "deepin-control-center-devel-5.5.143-1.7.aarch64.rpm"
RPM_HASH = "39eaa4c875d5b8438fe86965012bc683058ee6703cd3ed8c4a58f5a84e5ded8dde526bd2272f8cb37b88f7ecf4abee74cf04eb1007af33a9ce8cf213cffea161"

RPROVIDES:${PN} += "cmake(DdeControlCenter) deepin-control-center-devel deepin-control-center-devel(aarch-64)"
RDEPENDS:${PN} += "deepin-control-center"

inherit rpm
