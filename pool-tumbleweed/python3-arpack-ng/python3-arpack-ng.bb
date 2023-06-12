SUMMARY = "Python bindings for ARPACK"
DESCRIPTION = "ARPACK is a collection of Fortran77 subroutines designed to solve \
large scale eigenvalue problems. This package provides the python \
bindings for ARPACK."
LICENSE = "BSD-3-Clause"

PV = "3.9.0"

RPM_NAME = "python3-arpack-ng-3.9.0-1.4.aarch64.rpm"
RPM_HASH = "74dced43e29c2e619b57d0bbb11c333f1d8e17fbbe71037906f83931bd1c21c8c0bb97bf777204edac8f0dc0b800e7d5b4d4859c487c8c3ec6ea1a5f7c99a606"

RPROVIDES:${PN} += "python3-arpack-ng \
python3-arpack-ng(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_numpy-py3.so.1.82.0()(64bit) \
libboost_python-py3.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.0.0)(64bit) \
libgfortran.so.5()(64bit) \
libgfortran.so.5(GFORTRAN_8)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenblas.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi)"

inherit rpm
