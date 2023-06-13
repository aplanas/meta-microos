SUMMARY = "Permutation to Block Triangular Form"
DESCRIPTION = "BTF permutes an unsymmetric matrix (square or rectangular) into its \
block upper triangular form (more precisely, it computes a Dulmage- \
Mendelsohn decomposition). \
 \
BTF is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "libbtf1-1.2.6-49.1.aarch64.rpm"
RPM_HASH = "14bda221f68ef380f5961220ea87a48fa71d8fc398e7acc930cf914ded96c7ec85f18e7bf6a70e14e2af256c2f91babb367de69a75d82abf540c5d0b3e1e66c0"

RPROVIDES:${PN} += "libbtf-1_2_6 \
libbtf.so.1()(64bit) \
libbtf1 \
libbtf1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
