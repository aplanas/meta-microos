SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.16.2"

RPM_NAME = "python310-peewee-3.16.2-1.3.aarch64.rpm"
RPM_HASH = "e7c05323d8d65ac1ab2ea7779d9eb01e74ef51e9d09b918093fc55fe81277b704b68d8cc6b5ccc2923108a0a7fb4d2811387b2d7df76567629b4b2f423f564bb"

RPROVIDES:${PN} += "python3.10dist-peewee \
python310-peewee \
python3dist-peewee"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi \
update-alternatives"

inherit rpm
