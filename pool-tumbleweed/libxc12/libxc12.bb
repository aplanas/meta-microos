SUMMARY = "Library of exchange and correlation functionals to be used in DFT codes"
DESCRIPTION = "Libxc is a library of exchange and correlation functionals. Its \
purpose is to be used in codes that implement density-functional \
theory. The library includes most of the local density \
approximations (LDAs), generalized density approximation (GGAs), and \
meta-GGAs. The library provides values for the energy density and its \
1st, 2nd, and (for the LDAs) 3rd derivatives. \
 \
This package contains the library of libxc."
LICENSE = "MPL-2.0"

PV = "6.2.2"

RPM_NAME = "libxc12-6.2.2-1.1.aarch64.rpm"
RPM_HASH = "5763d4fdab18f52a74037b8f57a56ecd29b7be90d905951fde0b72639f485cc1d0d5ef3966837bd81a85246f6d7e0abf8a11c0143368001c3bb9aa0b3a32e3c7"

RPROVIDES:${PN} += "libxc.so.12 \
libxc12 \
libxcf03.so.12 \
libxcf90.so.12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6"

inherit rpm
