SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libgomp1-gcc12-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "5a6629845fc309801fc97c8a616dbc35e52cdb970a28d58c91e8b893dd85cfecf10927e2c52320522bd519954596cfed2e4c47f04e433df1229970d7dd1cd183"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1 \
libgomp1-gcc12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
