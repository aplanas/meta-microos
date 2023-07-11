SUMMARY = "Command-line utilities to convert from/to JPEG XL"
DESCRIPTION = "Command-line utilities to convert from/to JPEG XL."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "libjxl-tools-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "726e4a44f38ae5f8a00c826b6700bbaf2ab51d14236dc8c3dc27373b45ad2166e1c1a9d3ab63010110c7b128c97573b78864cadc1938bde8f7f83d0250e5b525"

RPROVIDES:${PN} += "libjxl-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhwy.so.1 \
libjpeg.so.8 \
libjxl-threads.so.0.8 \
libjxl.so.0.8 \
liblcms2.so.2 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6"

inherit rpm
