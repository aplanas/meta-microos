SUMMARY = "ThinIce Theme for GTK+ 2"
DESCRIPTION = "This package provides the ThinIce GTK+ 2 theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-theme-thinice-2.20.2-19.43.noarch.rpm"
RPM_HASH = "4171222607c3e1463d81d4217609179061f2d36f5ec0a31f7c18beb9c537833b88fdab48edd4149a79efdb8fde69b14f0668d302e93b3f08226760df890dd991"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-theme-thinice"

RDEPENDS:${PN} += "gtk2-engine-thinice"

inherit rpm
