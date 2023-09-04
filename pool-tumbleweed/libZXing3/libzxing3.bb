SUMMARY = "Library for processing 1D and 2D barcodes"
DESCRIPTION = "ZXing ('zebra crossing') is an multi-format 1D/2D barcode image \
processing library. This package provides a C++ implementation."
LICENSE = "Apache-2.0 & Zlib & LGPL-2.1-with-Qt-Company-Qt-exception-1.1"

PV = "2.0.0"

RPM_NAME = "libZXing3-2.0.0-3.1.aarch64.rpm"
RPM_HASH = "be0977068c54f382c2fb3b71ea2d7a9c0fa879a75854fb4295565e3626218c52ad9be6286f9839436b7dfd772e74005fe8b8c45fd41995b83153cf282b2753ed"

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
