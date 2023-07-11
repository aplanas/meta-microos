SUMMARY = "Library for encoding and decoding JPEG XL raster graphic images"
DESCRIPTION = "JPEG XL is a raster-graphics file format that supports both lossy and \
lossless compression."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "libjxl0_8-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "ed418f9ba45680c95aa7c87dd723524e1e712b3ecc87ffcb74b66f94584306e205889d19e07817fb1b7c32c4bc3f7016545b0f9d04ca277d5ae7531a8fc5e4a6"

RPROVIDES:${PN} += "libjxl-threads.so.0.8 \
libjxl.so.0.8 \
libjxl0-8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libhwy.so.1 \
liblcms2.so.2 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
