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

RPM_NAME = "libclFFT2-2.12.2-6.9.aarch64.rpm"
RPM_HASH = "de8cd621842066abc5c93e508992b0a1ab000f36291415e47df07ceb8215306493ba8362e1e331f76b2781711cec562a63133b777ae3670abf090fef5b3db4f1"

RPROVIDES:${PN} += "libclFFT.so.2 \
libclFFT2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
