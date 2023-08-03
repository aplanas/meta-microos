SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7597"

RPM_NAME = "libgomp1-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "f12a5cc800cb7a419b15021b10e76292f6514bf81fd679596d1650e8d0d7fd19a59c9a325da5db0860583980d9285c2773726504379d8cc110c03fb633977290"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
