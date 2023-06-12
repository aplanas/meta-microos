SUMMARY = "Package providing R-stats"
DESCRIPTION = "This package provides R-stats, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.3.0"

RPM_NAME = "R-stats-4.3.0-45.2.aarch64.rpm"
RPM_HASH = "dc37be6f09c9961d747d3e69e93fcae7b3641c05867aee80cfa81ee93f596e6e5eded12422d8f6ea4987dcff70f744b41cd1aee7b8f0f3276b4beb9bf2181bcb"

RPROVIDES:${PN} += "R-stats \
R-stats(aarch-64)"
RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libR.so()(64bit) \
libRblas.so()(64bit) \
libRlapack.so()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
