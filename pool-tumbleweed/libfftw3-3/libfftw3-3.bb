SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3-3-3.3.10-3.6.aarch64.rpm"
RPM_HASH = "b0957d836e43ebaaca1e309546f80cc3c530181b2bec0712ad90b2fc858d2d7c13efbae685ef47648d26bbc021d213638af08b3f4acc7f1b5971e949e8031a78"

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
