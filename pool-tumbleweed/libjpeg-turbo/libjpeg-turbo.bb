SUMMARY = "A SIMD-accelerated library for manipulating JPEG image files"
DESCRIPTION = "The libjpeg-turbo package contains a library of functions for manipulating \
JPEG images. It supports architecture-specific SIMD instructions, \
such as SSE/SSE2/AVX2, AltiVec, NEON, MIPS DSPR2, and Loongson MMI. \
 \
It also includes the following command line utilities: \
  djpeg - decompress a JPEG file to an image file \
  jpegtran - lossless transformation of JPEG files \
  rdjpgcom - display text comments from a JPEG file \
  wrjpgcom - insert text comments into a JPEG file \
  tjbench - a JPEG decompression/compression benchmark"
LICENSE = "BSD-3-Clause"

PV = "2.1.5.1"

RPM_NAME = "libjpeg-turbo-2.1.5.1-76.1.aarch64.rpm"
RPM_HASH = "fb32cf9ae2d0c03af6c52e24363af2ee747f9ad32c335aba7feb6e5ac099af81fd2c7b0022f3da22f90618e2415a2eaeb8dcdfc4d2ecbd059e17dc1612304d29"

RPROVIDES:${PN} += "jpeg \
jpegtran \
libjpeg-turbo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libturbojpeg.so.0"

inherit rpm
