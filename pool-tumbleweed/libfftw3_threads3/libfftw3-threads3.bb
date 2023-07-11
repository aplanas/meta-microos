SUMMARY = "Discrete Fourier Transform (DFT) C subroutine library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_threads3-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "19efd1f4f4488578679ec76b56f87f8edac314c93fee60fa615c544221e6e12a491ccaf00a3f6954fa28ef48289ed3b31e69d0d035bccf3bfecd63908f7440b9"

RPROVIDES:${PN} += "fftw3-threads \
libfftw3-threads.so.3 \
libfftw3-threads3 \
libfftw3f-threads.so.3 \
libfftw3l-threads.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libfftw3f.so.3 \
libfftw3l.so.3"

inherit rpm
