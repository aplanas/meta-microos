SUMMARY = "Lenstra-Lovász Lattice Basis Reduction Algorithm Library"
DESCRIPTION = "fplll contains several algorithms on lattices that rely on \
floating-point computations. This includes implementations of the \
floating-point LLL reduction algorithm, offering different \
speed/guarantees ratios. It also includes a rigorous floating-point \
implementation of the Kannan-Fincke-Pohst algorithm that finds a \
shortest non-zero lattice vector."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.4"

RPM_NAME = "libfplll8-5.4.4-1.3.aarch64.rpm"
RPM_HASH = "155630725b97446da3b04826b8127fe9b127f24c1d199ec890a511883d6a69b03bf04b254217130bc3e9ccff2d39f1c3eab3ee627903dd168aceb0f4bfc94f5c"

RPROVIDES:${PN} += "libfplll.so.8()(64bit) \
libfplll8 \
libfplll8(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgmp.so.10()(64bit) \
libm.so.6()(64bit) \
libmpfr.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
