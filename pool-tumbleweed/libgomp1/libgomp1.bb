SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libgomp1-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "b84c8592e72a1e69946de5b82c1a5449b2bc59695df7f8d1eede1d961dfcab303a175ca94e1908f014a222c4141e596bbd49a11f02ab646790ebc6540ccb6d44"

RPROVIDES:${PN} += "libgomp.so.1()(64bit) \
libgomp.so.1(GOACC_2.0)(64bit) \
libgomp.so.1(GOACC_2.0.1)(64bit) \
libgomp.so.1(GOACC_2.0.2)(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_2.0)(64bit) \
libgomp.so.1(GOMP_3.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(GOMP_4.0.1)(64bit) \
libgomp.so.1(GOMP_4.5)(64bit) \
libgomp.so.1(GOMP_5.0)(64bit) \
libgomp.so.1(GOMP_5.0.1)(64bit) \
libgomp.so.1(GOMP_5.1)(64bit) \
libgomp.so.1(GOMP_5.1.1)(64bit) \
libgomp.so.1(GOMP_PLUGIN_1.0)(64bit) \
libgomp.so.1(GOMP_PLUGIN_1.1)(64bit) \
libgomp.so.1(GOMP_PLUGIN_1.2)(64bit) \
libgomp.so.1(GOMP_PLUGIN_1.3)(64bit) \
libgomp.so.1(GOMP_PLUGIN_1.4)(64bit) \
libgomp.so.1(OACC_2.0)(64bit) \
libgomp.so.1(OACC_2.0.1)(64bit) \
libgomp.so.1(OACC_2.5)(64bit) \
libgomp.so.1(OACC_2.5.1)(64bit) \
libgomp.so.1(OACC_2.6)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libgomp.so.1(OMP_2.0)(64bit) \
libgomp.so.1(OMP_3.0)(64bit) \
libgomp.so.1(OMP_3.1)(64bit) \
libgomp.so.1(OMP_4.0)(64bit) \
libgomp.so.1(OMP_4.5)(64bit) \
libgomp.so.1(OMP_5.0)(64bit) \
libgomp.so.1(OMP_5.0.1)(64bit) \
libgomp.so.1(OMP_5.0.2)(64bit) \
libgomp.so.1(OMP_5.1)(64bit) \
libgomp.so.1(OMP_5.1.1)(64bit) \
libgomp.so.1(OMP_5.2)(64bit) \
libgomp1 \
libgomp1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm