SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.1.1+git7364"

RPM_NAME = "libgomp1-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "a3e4a7681e38d0771c83319549295eea1e04f2705737491fe1eb5d4e72aebb4e3fa4cd202c0424ae7bb5b26ea66c4f44a65cee87a60fbecd83c9c575ea4414a5"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
