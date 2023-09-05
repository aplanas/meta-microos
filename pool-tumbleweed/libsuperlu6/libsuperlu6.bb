SUMMARY = "SuperLU matrix solver"
DESCRIPTION = "SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "libsuperlu6-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "e01829e68101281be06f462542e4e901ec79b8d6346168000fe8245dbcea334e79da62c2727c29490e400751024cf2913856bf9b841bbf026f9c9afd63f3d7d2"

RPROVIDES:${PN} += "libsuperlu.so.6 \
libsuperlu6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libm.so.6"

inherit rpm
