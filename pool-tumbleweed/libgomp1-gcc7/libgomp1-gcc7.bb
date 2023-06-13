SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgomp1-gcc7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "e72cd59d968258442811277cab1045080a8b8bac0fb1350a6f44f15d02e6197e2190e882a9fce842ae1540a43aee9d53e0d5d1c1f422cc72083e1b2225498131"

RPROVIDES:${PN} += "libgomp.so.1()(64bit) \
libgomp1 \
libgomp1-gcc7 \
libgomp1-gcc7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit)"

inherit rpm
