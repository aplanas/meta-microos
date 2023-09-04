SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.16.3"

RPM_NAME = "python311-peewee-3.16.3-1.1.aarch64.rpm"
RPM_HASH = "e2e3e8caaacbf2eb8090faaac55519a2dfe3aff69d5dfd8d9c46b255c9bcff629d96c3f2a1d1bcef2dee417b4fbd9c3ec77d95f81dde8f73abf9e10cae675bf2"

RPROVIDES:${PN} += "python3-peewee \
python3.11dist-peewee \
python311-peewee \
python3dist-peewee"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi \
update-alternatives"

inherit rpm
