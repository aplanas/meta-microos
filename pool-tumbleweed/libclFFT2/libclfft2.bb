SUMMARY = "Library for libclfft"
DESCRIPTION = "The clFFT library is an OpenCL implementation of discrete \
Fast Fourier Transforms which: \
  * Works on CPU or GPU backends. \
  * Supports in-place or out-of-place transforms. \
  * Supports 1D, 2D, and 3D transforms with a batch size that can be greater \
    than 1. \
  * Supports planar (real and complex components in separate arrays) and \
    interleaved (real and complex components as a pair contiguous in memory) \
    formats. \
  * Supports dimension lengths that can be any mix of powers of 2, 3, and 5. \
  * Supports single and double precision floating point formats. \
 \
This subpackage provides shared library clFFT library"
LICENSE = "Apache-2.0"

PV = "2.12.2"

RPM_NAME = "libclFFT2-2.12.2-6.8.aarch64.rpm"
RPM_HASH = "e27483b570f9bb2aff8d871e4cfeff79b9df711b8edc19cb2ee8b7d47eb28862b091522f13e2dbf9e52bf3886c2dc86534d63dcd67d1b2da97c6bb191aaf5bec"

RPROVIDES:${PN} += "libclFFT.so.2()(64bit) \
libclFFT2 \
libclFFT2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libOpenCL.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
