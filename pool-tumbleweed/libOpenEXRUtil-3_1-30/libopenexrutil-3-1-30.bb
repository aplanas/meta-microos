SUMMARY = "Library to simplify development of OpenEXR utilities"
DESCRIPTION = "OpenEXR is a high dynamic-range (HDR) image file format developed by \
Industrial Light & Magic for use in computer imaging applications. \
 \
This package contains shared library libOpenEXRUtil"
LICENSE = "BSD-3-Clause"

PV = "3.1.11"

RPM_NAME = "libOpenEXRUtil-3_1-30-3.1.11-1.1.aarch64.rpm"
RPM_HASH = "836f00a79270ea07f6acbce1f11fde444fdce149c36c693ff4fb4f2c8709c49e4b5576a08f589e6be696fbeadcd6f51ff93f4c2615eddd1299cf4915283c2473"

RPROVIDES:${PN} += "libOpenEXRUtil-3-1-30 \
libOpenEXRUtil-3-1.so.30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libOpenEXR-3-1.so.30 \
libOpenEXRCore-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
