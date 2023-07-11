SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libgomp1-gcc7-7.5.0+r278197-14.6.aarch64.rpm"
RPM_HASH = "ecfb56ea7256a089f67ab0618114218f4f8dcedc7cec86f060ddc2c98665b80511922339e13b3307e1c6c1b874f64ff0dde9ede42b9622222e5be6d58ae66ac1"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1 \
libgomp1-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
