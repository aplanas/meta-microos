SUMMARY = "Threaded poller for Cacti written in C"
DESCRIPTION = "Spine is a supplemental poller for Cacti that makes use of pthreads to achieve \
excellent performance."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.24"

RPM_NAME = "cacti-spine-1.2.24-1.3.aarch64.rpm"
RPM_HASH = "f7e5511fb19259bca3e3842e3f5e5b5d2477361be5c8464628a551dffc1d7ac1ca43f2b01203066909ff208e88277f01fdada01199434415fce2a9c7a5a04b44"

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
