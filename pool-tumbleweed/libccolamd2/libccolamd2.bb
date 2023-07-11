SUMMARY = "Constrained Column Approximate Minimum Degree"
DESCRIPTION = "CCOLAMD computes an column approximate minimum degree ordering \
algorithm, (like COLAMD), but it can also be given a set of ordering \
constraints. CCOLAMD is required by the CHOLMOD package. \
 \
CCOLAMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "2.9.6"

RPM_NAME = "libccolamd2-2.9.6-49.2.aarch64.rpm"
RPM_HASH = "6955d7fe0d20bf05e2224e375350a33085dd519246f6b30db5b70a027813413c4669619390426597fe875c4103e02d0763767bea6f7aeb542963d5a32a6aa565"

RPROVIDES:${PN} += "libccolamd-2-9-6 \
libccolamd.so.2 \
libccolamd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.5"

inherit rpm
