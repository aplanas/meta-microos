SUMMARY = "Lenstra-Lovász Lattice Basis Reduction Algorithm Library"
DESCRIPTION = "fplll contains several algorithms on lattices that rely on \
floating-point computations. This includes implementations of the \
floating-point LLL reduction algorithm, offering different \
speed/guarantees ratios. It also includes a rigorous floating-point \
implementation of the Kannan-Fincke-Pohst algorithm that finds a \
shortest non-zero lattice vector."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.4"

RPM_NAME = "fplll-5.4.4-1.4.aarch64.rpm"
RPM_HASH = "e39553a9ae41f1217ba9a34fc7cca09b7acafdde5eb6025dec47f0f1971d4259065fde223f1579cc2a787e7fdeb400a04586822481507fd2138540e7614b73ab"

RPROVIDES:${PN} += "fplll"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfplll.so.8 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
