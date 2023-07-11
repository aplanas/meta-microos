SUMMARY = "Python bindings for ARPACK"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package provides the python \
bindings for ARPACK."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python3-arpack-ng-3.9.0-1.5.aarch64.rpm"
RPM_HASH = "ea8361c2da4065bb016a9ab393ac6006b9817febd68b1ae348371e3d8554f09874f7fabe5c119f2354164562a9f462565ce2ad100250b4d9d0a1bd6d5ad17a09"

RPROVIDES:${PN} += "python3-arpack-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-numpy-py3.so.1.82.0 \
libboost-python-py3.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
