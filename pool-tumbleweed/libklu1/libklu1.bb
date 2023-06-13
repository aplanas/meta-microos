SUMMARY = "Sparse LU Factorization, for Circuit Simulation"
DESCRIPTION = "KLU is a sparse LU factorization algorithm well-suited for use in \
circuit simulation. It was highlighted in the May 2007 issue of SIAM \
News, Sparse Matrix Algorithm Drives SPICE Performance Gains. It is \
the 'fast sparse-matrix solver' mentioned in the article. \
 \
KLU is part of the SuiteSparse sparse matrix suite."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.9"

RPM_NAME = "libklu1-1.3.9-49.1.aarch64.rpm"
RPM_HASH = "e7530ed84b04616a303a630d6067f418e5dcf76999cf4ff561f795e5b51cfb76f0e352391924c5bc29fcf6768e88d5fdf28db24157d1d8eed99a37afb16dd465"

RPROVIDES:${PN} += "libklu-1_3_9 \
libklu.so.1()(64bit) \
libklu1 \
libklu1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libamd.so.2()(64bit) \
libbtf.so.1()(64bit) \
libc.so.6()(64bit) \
libcolamd.so.2()(64bit) \
libsuitesparseconfig.so.5()(64bit)"

inherit rpm
