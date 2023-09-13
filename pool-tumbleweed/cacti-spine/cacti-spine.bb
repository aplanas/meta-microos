SUMMARY = "Threaded poller for Cacti written in C"
DESCRIPTION = "Spine is a supplemental poller for Cacti that makes use of pthreads to achieve \
excellent performance."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.25"

RPM_NAME = "cacti-spine-1.2.25-1.1.aarch64.rpm"
RPM_HASH = "6cf1d07dff1f940106699652526bf69205e6bad9ac06d299e4cb5d7c03185ed2199167e88722666bec87dd699ecb9825a3bca796c6df2da4a98a6226e70091cd"

RPROVIDES:${PN} += "cacti-spine \
config-cacti-spine"

RDEPENDS:${PN} += "cacti \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmariadb.so.3 \
libnetsnmp.so.40 \
rrdtool"

inherit rpm
