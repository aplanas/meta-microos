SUMMARY = "Constrained Column Approximate Minimum Degree"
DESCRIPTION = "CCOLAMD computes an column approximate minimum degree ordering \
algorithm, (like COLAMD), but it can also be given a set of ordering \
constraints. CCOLAMD is required by the CHOLMOD package. \
 \
CCOLAMD is part of the SuiteSparse sparse matrix suite."
LICENSE = "BSD-3-Clause"

PV = "2.9.6"

RPM_NAME = "libccolamd2-2.9.6-49.1.aarch64.rpm"
RPM_HASH = "f81bc692a852741b25ff730d4a76f989f49f93f0e53bc0e8841be72eb53a8c8251c5415d60ee71bb9adf9bc235e455f02abd50e3704b7ce843beae8d59773229"

RPROVIDES:${PN} += "libccolamd-2-9-6 \
libccolamd.so.2 \
libccolamd2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsuitesparseconfig.so.5"

inherit rpm
