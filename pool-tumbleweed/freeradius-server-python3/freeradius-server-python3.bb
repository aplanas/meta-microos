SUMMARY = "Python3 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Python3 support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-python3-3.2.1-1.7.aarch64.rpm"
RPM_HASH = "dc3df744e6a5a6161284f2969e56d2c06fe06a3077ed316bf7c6d700e4eaafa388815dc6dab5af9ea48f7d95b504dcc5d6d4354fea25f29ac7d425f1f2093985"

RPROVIDES:${PN} += "freeradius-server-python3"

RDEPENDS:${PN} += "/usr/bin/python3 \
freeradius-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0"

inherit rpm
