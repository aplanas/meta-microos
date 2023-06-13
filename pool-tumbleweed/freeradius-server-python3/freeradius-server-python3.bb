SUMMARY = "Python3 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Python3 support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-python3-3.2.1-1.3.aarch64.rpm"
RPM_HASH = "bc87cdb90003953dea4460bb48417f172041bf463505c6e8904ed09d81f66afdebcda3b4604bab6a77525aa07b4ecbf0f4b67b60b2c2ce7d2252b7339101502d"

RPROVIDES:${PN} += "freeradius-server-python3 \
freeradius-server-python3(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
freeradius-server \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpython3.10.so.1.0()(64bit)"

inherit rpm
