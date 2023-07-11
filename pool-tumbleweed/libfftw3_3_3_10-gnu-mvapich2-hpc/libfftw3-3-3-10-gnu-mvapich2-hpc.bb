SUMMARY = "Discrete Fourier Transform (DFT) C Subroutine Library"
DESCRIPTION = "FFTW is a C subroutine library for computing the Discrete Fourier \
Transform (DFT) in one or more dimensions, of both real and complex \
data, and of arbitrary input size."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "libfftw3_3_3_10-gnu-mvapich2-hpc-3.3.10-3.7.aarch64.rpm"
RPM_HASH = "6203e6e1994dc94083054b0200f4d90657f0c2f6c4d5e659774c1c163fc39c1a231096af70263a0ef9d81de80c0cc7d529e0db164d3749b1578d3ea732267080"

RPROVIDES:${PN} += "fftw3 \
libfftw3-3-3-10-gnu-mvapich2-hpc"

RDEPENDS:${PN} += "/sbin/ldconfig \
gnu-compilers-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6 \
lua-lmod \
mvapich2-gnu-hpc"

inherit rpm
