SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libgomp1-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "2e3428330d149565fc700cbb5b232665c1ccb4711856aaa5bf647751a280a0fbe6fafb80b2d20c73aaa3857ebc26c9361d4531c9cd595c93baa9ff6279040cda"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
