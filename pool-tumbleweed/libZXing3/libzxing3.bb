SUMMARY = "Library for processing 1D and 2D barcodes"
DESCRIPTION = "ZXing ('zebra crossing') is an multi-format 1D/2D barcode image \
processing library. This package provides a C++ implementation."
LICENSE = "Apache-2.0 & Zlib & LGPL-2.1-with-Qt-Company-Qt-exception-1.1"

PV = "2.0.0"

RPM_NAME = "libZXing3-2.0.0-2.2.aarch64.rpm"
RPM_HASH = "c22e1ad76efd5056164e5b13c11aec6d557c65f718a5c556c6228511f24515971b5656e8df45ea602447bf65a550fc2921970893ded7d0d42764c601c24c546c"

RPROVIDES:${PN} += "libZXing.so.3 \
libZXing3 \
libZXingCore3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
