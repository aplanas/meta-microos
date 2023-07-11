SUMMARY = "Development for libjxl, an en-/decoder for JPEG XL"
DESCRIPTION = "JPEG XL is a raster-graphics file format that supports both lossy and \
lossless compression. \
 \
This is the reference implementation of JPEG XL, with encoder and decoder."
LICENSE = "BSD-3-Clause"

PV = "0.8.2"

RPM_NAME = "libjxl-devel-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "3db13ed78486cf38dcea9243e16d02f28b08cda2529796bfb0b2eaeb83562195aa6b62fd0e632f51d2d7e6f171730b702e6411edf8a6c4d5db63c32af392996a"

RPROVIDES:${PN} += "libjxl-devel \
pkgconfig-libjxl \
pkgconfig-libjxl-threads"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjxl0-8 \
pkgconfig-lcms2 \
pkgconfig-libbrotlicommon \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc \
pkgconfig-libhwy"

inherit rpm
