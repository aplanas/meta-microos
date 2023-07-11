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

RPM_NAME = "libStatTimer2-2.12.2-6.9.aarch64.rpm"
RPM_HASH = "076ebd64f77c530f702aef6ea3b053f291a5c3fa9345c0f44837c8248736212b8a88fcadbfb3c88b1c0cf0500ed24169e1c2449f80f62f357791682c49093b9f"

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
