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
This subpackage provides shared libStatTimer library"
LICENSE = "Apache-2.0"

PV = "2.12.2"

RPM_NAME = "libStatTimer2-2.12.2-6.8.aarch64.rpm"
RPM_HASH = "3e2d0bfd69ee7389cc880a4b687c075c5205538f1673b05f0bffd20a6e7eebf6c21aeef61c735cdf628e74b05f1f2599937962fc574c61f2c458040c2797fd34"

RPROVIDES:${PN} += "libStatTimer.so.2 \
libStatTimer2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
