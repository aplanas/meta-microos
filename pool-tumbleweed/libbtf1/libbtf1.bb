SUMMARY = "Permutation to Block Triangular Form"
DESCRIPTION = "BTF permutes an unsymmetric matrix (square or rectangular) into its \
block upper triangular form (more precisely, it computes a Dulmage- \
Mendelsohn decomposition). \
 \
BTF is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "libbtf1-1.2.6-49.2.aarch64.rpm"
RPM_HASH = "6f190804f29c71d376de7e046e47d4c2931349b9ac85a16c91cfae6415200e82eef305476b8925c5e5a1c4f14e3b67cfc174322d41229f84f96b7763284b88f2"

RPROVIDES:${PN} += "libbtf-1-2-6 \
libbtf.so.1 \
libbtf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
