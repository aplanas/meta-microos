SUMMARY = "Files needed for developing arpack based applications"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package contains the so \
library links used for building arpack based applications."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "libarpack2-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "376a4b41c4c8507ebf554e4716ef72c79ed2b79958983f13590a7a3a0989e23346938bd275687816e77fa0ac912bfd9156edb0db2511bfd725eafb5e6b12c2dd"

RPROVIDES:${PN} += "libarpack.so.2 \
libarpack2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0"

inherit rpm
