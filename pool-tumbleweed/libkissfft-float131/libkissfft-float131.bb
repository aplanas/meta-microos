SUMMARY = "Fast Fourier Transform library"
DESCRIPTION = "A Fast Fourier Transform based up on the principle, 'Keep It Simple, Stupid'. \
Kiss FFT is a very small, reasonably efficient, mixed radix FFT library that \
can use either fixed or floating point data types."
LICENSE = "BSD-3-Clause & Unlicense"

PV = "131.1.0"

RPM_NAME = "libkissfft-float131-131.1.0-2.4.aarch64.rpm"
RPM_HASH = "709bc81714d6ec6d7bd92650d5332c8cdbd2cf1f5fda15ac7c3f59424a7696d4ee5cd625b4c23c701d1565d09b12c34e5d9bd1bc2c58791703eca39da5b601f6"

RPROVIDES:${PN} += "libkissfft-float.so.131 \
libkissfft-float131"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
