SUMMARY = "A small library for fetching information from DeltaRPM packages"
DESCRIPTION = "This package provides a small library allowing one to fetch \
information from DeltaRPM packages."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.1"

RPM_NAME = "libdrpm0-0.5.1-1.4.aarch64.rpm"
RPM_HASH = "9b57a49eb7697f1a884399dc9658fb8d2902ecace3d66d1cd3c307cceabd28bf3dd2847414360bcfa0352991dd4851cd425ed0be96a1671c06fe5bd8a9b52569"

RPROVIDES:${PN} += "libdrpm.so.0()(64bit) \
libdrpm0 \
libdrpm0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
liblzma.so.5()(64bit) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
