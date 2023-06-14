SUMMARY = "Library for encoding and decoding JPEG XL raster graphic images"
DESCRIPTION = "JPEG XL is a raster-graphics file format that supports both lossy and \
lossless compression."
LICENSE = "BSD-3-Clause"

PV = "0.8.1"

RPM_NAME = "libjxl0_8-0.8.1-3.1.aarch64.rpm"
RPM_HASH = "5e8ad3687ae732d2c3e949e261c0c04288530e13601688419eb0e6a0e24e15aecaa7128c802e5cf096c3ddaa73ef93554c6c9f0a7afd412f31cec213e712bfd9"

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
