SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-3-3.3.10-3.5.aarch64.rpm"
RPM_HASH = "d746be14210d803afa621b0cac9d58279d663901d9273a4d9bdd00d212ebf3cb3b9b7d1deefc16930adb70667b0a33e91c50e8c50ab8fe2df8aaed6cd36b2616"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3 \
libfftw3.so.3 \
libfftw3f.so.3 \
libfftw3l.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
