SUMMARY = "Imlib 2 - plugin filters"
DESCRIPTION = "This package has the basic set of plugin filters that come with Imlib2."
LICENSE = "BSD-3-Clause"

PV = "1.12.0"

RPM_NAME = "imlib2-filters-1.12.0-2.1.aarch64.rpm"
RPM_HASH = "134a404e8369685de2de7d0d3939d59ae38d8aa1ed46c3a572bcfbe6d819c9c3fc5770e68fbc765173764ff04cdce9980ff1b0675a796408206347dcd7c882b8"

RPROVIDES:${PN} += "imlib2-filters"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImlib2-1 \
libImlib2.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
