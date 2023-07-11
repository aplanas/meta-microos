SUMMARY = "Library for Elliptic Curve Integer Factorization"
DESCRIPTION = "Library for ecm. To use the library, you need to install ecm-devel, include \
'ecm.h' in your source file and link with -lecm."
LICENSE = "GPL-3.0-only"

PV = "7.0.5"

RPM_NAME = "libecm1-7.0.5-1.4.aarch64.rpm"
RPM_HASH = "19ca425ca1ecd498f22da671edaacd49dd0779b231d1c2e871d1c8f9b25faf3de8c83a368b7547284bbc2b09289405497a968cc8b56da4bf4809cc3c600d8f9a"

RPROVIDES:${PN} += "libecm.so.1 \
libecm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
