SUMMARY = "Python bindings for ARPACK"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package provides the python \
bindings for ARPACK."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python3-arpack-ng-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "74dced43e29c2e619b57d0bbb11c333f1d8e17fbbe71037906f83931bd1c21c8c0bb97bf777204edac8f0dc0b800e7d5b4d4859c487c8c3ec6ea1a5f7c99a606"

RPROVIDES:${PN} += "python3-arpack-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-numpy-py3.so.1.82.0 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0 \
libpython3.10.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
