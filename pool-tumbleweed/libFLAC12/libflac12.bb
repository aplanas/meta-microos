SUMMARY = "Free Lossless Audio Codec Library"
DESCRIPTION = "FLAC is an audio coding format for lossless compression of digital \
audio, and is also the name of the reference software package that \
includes a codec implementation. \
 \
This package contains the C API library for FLAC."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GFDL-1.2-only"

PV = "1.4.2"

RPM_NAME = "libFLAC12-1.4.2-2.3.aarch64.rpm"
RPM_HASH = "8675d8fa7f5537d5a2193700db568dd94133e29a8c51b1e09d9c8edfe0db8fa1aed7d369b99b6a9a38b680ea634e009ec35e6d4d8ec6dbce98a064868e424008"

RPROVIDES:${PN} += "libFLAC.so.12()(64bit) \
libFLAC12 \
libFLAC12(aarch-64) \
libflac"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libogg.so.0()(64bit)"

inherit rpm