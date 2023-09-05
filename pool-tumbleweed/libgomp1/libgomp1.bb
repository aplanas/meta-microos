SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.2.1+git7683"

RPM_NAME = "libgomp1-13.2.1+git7683-2.1.aarch64.rpm"
RPM_HASH = "533c2eee135130644a9b739674c9deb6dcb1536873affaeee16369c48afe77d56fb7e924ba0a17e5a813704067220d9cf145121928daae5f07389c284fd6a221"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
