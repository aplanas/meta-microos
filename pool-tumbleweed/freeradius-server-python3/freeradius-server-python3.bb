SUMMARY = "Python3 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Python3 support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.3"

RPM_NAME = "freeradius-server-python3-3.2.3-1.1.aarch64.rpm"
RPM_HASH = "930b5dbb10ab3114f059a0829e0db8afb6369f06e209af8da0f1a8af5c628928f45849aceafe5be8002259d070b1f6c505dcbd9344ff161619bcb3207eca76aa"

RPROVIDES:${PN} += "freeradius-server-python3"

RDEPENDS:${PN} += "/usr/bin/python3 \
freeradius-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0"

inherit rpm
