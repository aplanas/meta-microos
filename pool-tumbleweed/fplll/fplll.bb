SUMMARY = "Lenstra-Lovász Lattice Basis Reduction Algorithm Library"
DESCRIPTION = "fplll contains several algorithms on lattices that rely on \
floating-point computations. This includes implementations of the \
floating-point LLL reduction algorithm, offering different \
speed/guarantees ratios. It also includes a rigorous floating-point \
implementation of the Kannan-Fincke-Pohst algorithm that finds a \
shortest non-zero lattice vector."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.4"

RPM_NAME = "fplll-5.4.4-1.3.aarch64.rpm"
RPM_HASH = "3be25086ec55c7c22aaf62342407c7cc4ebd4cdfd9f4ef391c7125dec667b6b0d5b2cf2e9a80eea366b8fae3fa5453067c0c00b2efd73fee124e58652fb63e23"

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
