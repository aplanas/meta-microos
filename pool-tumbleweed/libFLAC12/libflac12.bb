SUMMARY = "Free Lossless Audio Codec Library"
DESCRIPTION = "FLAC is an audio coding format for lossless compression of digital \
audio, and is also the name of the reference software package that \
includes a codec implementation. \
 \
This package contains the C API library for FLAC."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.4.3"

RPM_NAME = "libFLAC12-1.4.3-1.1.aarch64.rpm"
RPM_HASH = "b4424674f31f82b59a9c21137c391b225805e1e4cf0d4a7d7fdd1f5486951cbbfb534da65bc15a813349df2a8e9fcfcd11c43ba285fcd54d8860fb91a56aa598"

RPROVIDES:${PN} += "libFLAC.so.12 \
libFLAC12 \
libflac"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libogg.so.0"

inherit rpm
