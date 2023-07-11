SUMMARY = "Lenstra-Lovász Lattice Basis Reduction Algorithm Library"
DESCRIPTION = "fplll contains several algorithms on lattices that rely on \
floating-point computations. This includes implementations of the \
floating-point LLL reduction algorithm, offering different \
speed/guarantees ratios. It also includes a rigorous floating-point \
implementation of the Kannan-Fincke-Pohst algorithm that finds a \
shortest non-zero lattice vector."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.4"

RPM_NAME = "libfplll8-5.4.4-1.4.aarch64.rpm"
RPM_HASH = "c554ffead19fe5369b4424e5f129c3ce434b5fa39d15e4fa1541d8c67e75a0b4304f102caf317bba090808b85d4446418eae5a33a5ad36189ae88c0c555f0258"

RPROVIDES:${PN} += "libfplll.so.8 \
libfplll8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libmpfr.so.6 \
libstdc++.so.6"

inherit rpm
