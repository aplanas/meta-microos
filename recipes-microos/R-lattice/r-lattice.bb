SUMMARY = "Package provides recommended R-lattice"
DESCRIPTION = "This packages provides R-lattice, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.21.8"

RPM_NAME = "R-lattice-0.21.8-45.1.aarch64.rpm"
RPM_HASH = "f86e16576f99ace3ceaa7c590c76fedf9476206c7c01d3e4c54a75e4b4d256fe05af47001c48cf3944c3c9e7808249b7f3f2fb87ee149ee484b32ef0fb4a6038"

RPROVIDES:${PN} += "R-lattice R-lattice(aarch-64)"
RDEPENDS:${PN} += "R-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libR.so()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
