SUMMARY = "Python3 support for freeradius"
DESCRIPTION = "FreeRADIUS plugin providing Python3 support."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "3.2.1"

RPM_NAME = "freeradius-server-python3-3.2.1-1.6.aarch64.rpm"
RPM_HASH = "0d2eb9a333bf798653df700599ba9b7af581a211b8b1b79b96f49937708e656ba4c2d476438c55633cea87215da74c11e3ce360f76f537c4f2bfd032f040d526"

RPROVIDES:${PN} += "freeradius-server-python3"

RDEPENDS:${PN} += "/usr/bin/python3 \
freeradius-server \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0"

inherit rpm
