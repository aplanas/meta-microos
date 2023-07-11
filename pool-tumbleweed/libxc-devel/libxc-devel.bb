SUMMARY = "Development files for libxc"
DESCRIPTION = "Libxc is a library of exchange and correlation functionals. Its \
purpose is to be used in codes that implement density-functional \
theory. The library includes most of the local density \
approximations (LDAs), generalized density approximation (GGAs), and \
meta-GGAs. The library provides values for the energy density and its \
1st, 2nd, and (for the LDAs) 3rd derivatives. \
 \
This package contains development headers and libraries for libxc."
LICENSE = "MPL-2.0"

PV = "6.2.2"

RPM_NAME = "libxc-devel-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "54306dcfff42b5e897aa10efdfad6ca6d8508eda73681473865dc525573992835aaa782fcdeb43bb70e6073922261bf1eec279ec0ff3011914dd5a14626d7330"

RPROVIDES:${PN} += "libxc-devel \
pkgconfig-libxc \
pkgconfig-libxcf03 \
pkgconfig-libxcf90"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxc.so.12 \
libxc12"

inherit rpm
