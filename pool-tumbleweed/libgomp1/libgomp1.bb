SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7552"

RPM_NAME = "libgomp1-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "c1210aa4ac1e927c98f006d45abeb3fe1b0c97fea1133e312b8a59d315d8ccef35be55b52ecb97811dec2c03069ed67abad0eb2d05402d41f09a6274f71e1ab3"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
