SUMMARY = "Performance Co-Pilot (PCP) System and Monitoring Tools"
DESCRIPTION = "This PCP module contains additional system monitoring tools written \
in python."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-system-tools-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "c3d1bf0e522dfa378458b6fc40b5870870d3611fca0e4dc8ece13c5780492cb9e5637debd0936c6895405580087ab907a63978cc1541a66624ea0b48ac3a756c"

RPROVIDES:${PN} += "config-pcp-system-tools \
pcp-system-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libpcp-gui.so.2 \
libpcp.so.3 \
libtinfo.so.6 \
python3-pcp"

inherit rpm
