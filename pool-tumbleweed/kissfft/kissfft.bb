SUMMARY = "Fast Fourier Transform library"
DESCRIPTION = "A Fast Fourier Transform based up on the principle, 'Keep It Simple, Stupid'. \
Kiss FFT is a very small, reasonably efficient, mixed radix FFT library that \
can use either fixed or floating point data types."
LICENSE = "BSD-3-Clause & Unlicense"

PV = "131.1.0"

RPM_NAME = "kissfft-131.1.0-2.4.aarch64.rpm"
RPM_HASH = "57e9e6885eb8e3c0c6af914498ac36138db257557268ca99053925e2b421d0a4123a6a2a44e2de7474a6cef9c54788e0d50cfc731f042cbf16004f683a559300"

RPROVIDES:${PN} += "kissfft"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkissfft-float.so.131 \
libm.so.6 \
libpng16.so.16"

inherit rpm
