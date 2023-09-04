SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.16.3"

RPM_NAME = "python39-peewee-3.16.3-1.1.aarch64.rpm"
RPM_HASH = "cfa3c70ffd7693354260e0848071a571f4767b9f34f4f5eb945c03c8893a64642b399c2b9ab16c0894a07c32bfbfe813ac81d958d66d988e427e61325e86c8b0"

RPROVIDES:${PN} += "python3.9dist-peewee \
python39-peewee \
python3dist-peewee"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
python-abi \
update-alternatives"

inherit rpm
