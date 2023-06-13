SUMMARY = "An interactive TUI S.M.A.R.T viewer"
DESCRIPTION = "CrazyDiskInfo is an interactive TUI S.M.A.R.T viewer. \
It offers the following features: \
 \
 * An UI similar to CrystalDiskInfo. \
 * Health and temperature checking algorithms based on CrystalDiskInfo."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "crazydiskinfo-1.1.0-1.13.aarch64.rpm"
RPM_HASH = "08740b6c5d38960f7450246ef40273a7288822713244a30e2a048fe922cdb9b35d925ea50ede3331dc441fb1dcd89a08c7f48e7ea5b505b63c97d1e80c9da896"

RPROVIDES:${PN} += "crazydiskinfo \
crazydiskinfo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libatasmart.so.4()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libncursesw.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
