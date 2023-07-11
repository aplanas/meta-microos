SUMMARY = "Sparse LU Factorization, for Circuit Simulation"
DESCRIPTION = "KLU is a sparse LU factorization algorithm well-suited for use in \
circuit simulation. It was highlighted in the May 2007 issue of SIAM \
News, Sparse Matrix Algorithm Drives SPICE Performance Gains. It is \
the 'fast sparse-matrix solver' mentioned in the article. \
 \
KLU is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.9"

RPM_NAME = "libklu1-1.3.9-49.2.aarch64.rpm"
RPM_HASH = "f913963f33ef11ccc5b0c5968fc10cf31c48e823e83b37c7821b24f5389bd3d30fbc0855ac2ddff65c24d82e0d3c7243ec6c356abfda0d6130c39aa6a055b1e4"

RPROVIDES:${PN} += "libklu-1-3-9 \
libklu.so.1 \
libklu1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libamd.so.2 \
libbtf.so.1 \
libc.so.6 \
libcolamd.so.2 \
libsuitesparseconfig.so.5"

inherit rpm
