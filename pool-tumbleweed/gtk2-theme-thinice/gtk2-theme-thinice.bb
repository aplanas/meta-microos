SUMMARY = "ThinIce Theme for GTK+ 2"
DESCRIPTION = "This package provides the ThinIce GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-thinice-2.20.2-19.42.noarch.rpm"
RPM_HASH = "8f7e0ea32d79cb060ff730bf23877dab6cc18bc74174d6daa38cb2448eccc1547642e8cee2a122182fb5b77a2e1b9b4c116278668632cca5d576382e4e3e5da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-thinice"

RDEPENDS:${PN} += "gtk2-engine-thinice"

inherit rpm
