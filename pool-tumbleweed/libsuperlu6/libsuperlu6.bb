SUMMARY = "SuperLU matrix solver"
DESCRIPTION = "SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "libsuperlu6-6.0.0-2.1.aarch64.rpm"
RPM_HASH = "87691453aaa9db3d8730d1c3e02c68c67f4ee67b6990bfe045c834dd99d6544039ee9e8cf968840dc937cf93ae4c68330894151dc3ef9155fc01c23336332ad6"

RPROVIDES:${PN} += "libsuperlu.so.6()(64bit) \
libsuperlu6 \
libsuperlu6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libblas.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
