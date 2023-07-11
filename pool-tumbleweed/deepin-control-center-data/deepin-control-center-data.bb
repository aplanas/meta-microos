SUMMARY = "Data of deepin-control-center"
DESCRIPTION = "The deepin-control-center is the control panel of Deepin Desktop. \
 \
deepin-control-center-data is the data of deepin-control-center."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.143"

RPM_NAME = "deepin-control-center-data-5.5.143-1.8.noarch.rpm"
RPM_HASH = "e0df0f2362ef658b73b848dbc6992aaafdd0f1dff794a56f3dff1ab2b337d13a73908b1ad6a55426c34e664013352083cf05026e3e0418bfcc6667f7cbf4408d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-control-center-data"

RDEPENDS:${PN} += "deepin-control-center"

inherit rpm
