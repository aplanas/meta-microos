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

RPM_NAME = "liboil-0_3-0-0.3.17-26.7.aarch64.rpm"
RPM_HASH = "d80767625af2664a24f7093497ccaaf1daf280249e114dbfc2c1f351b626e9dc15197e9c4fb0f13ebe2443596c278f9a7c7a956675fa3bb01277254ee48d3834"

RPROVIDES:${PN} += "liboil-0.3.so.0()(64bit) \
liboil-0_3-0 \
liboil-0_3-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
