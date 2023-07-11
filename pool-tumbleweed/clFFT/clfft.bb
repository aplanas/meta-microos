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

RPM_NAME = "clFFT-2.12.2-6.9.aarch64.rpm"
RPM_HASH = "d166aa742d4a6077e8da599babd0c26ec618b085eb73a5770656e27e1dcb58f3d23c59f06a6b38c0b97149d65b1d3fd7a40c44f4250d5e35e24f07f8272d0fe6"

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
