SUMMARY = "OpenCL FFT library"
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
  * Supports single and double precision floating point formats."
LICENSE = "Apache-2.0"

PV = "2.12.2"

RPM_NAME = "clFFT-2.12.2-6.8.aarch64.rpm"
RPM_HASH = "f33b3f9869501a37d9a208295ff05e6df19eab4e15daa923ae53cb60c24186359cb7d3f2413f15ba11f08d0fb6c3605ff1cb25bf518774497e0b795aca517e49"

RPROVIDES:${PN} += "clFFT"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libboost-program-options.so.1.82.0 \
libc.so.6 \
libclFFT.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
