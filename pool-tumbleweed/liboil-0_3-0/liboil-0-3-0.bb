SUMMARY = "Library of Optimized Inner Loops"
DESCRIPTION = "Liboil is a library of functions that are optimized for various \
CPUs. These functions are generally loops implementing \
algorithms, such as converting an array of N integers to floating-point \
numbers or multiplying and summing an array of N numbers. Such \
functions are candidates for significant optimization using various \
techniques, especially by using extended instructions provided by \
modern CPUs (Altivec, MMX, SSE, etc.)."
LICENSE = "BSD-2-Clause"

PV = "0.3.17"

RPM_NAME = "liboil-0_3-0-0.3.17-26.8.aarch64.rpm"
RPM_HASH = "0de562d418dbb7f53bc4b824167fb83621ebb2dd073292ecf00b5b8ba86b7be67e677ff3a2cccb6ab4c880f6a2a928245b146e14f575897226e1e5e6adafc6f8"

RPROVIDES:${PN} += "liboil-0-3-0 \
liboil-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
