SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.16.3"

RPM_NAME = "python310-peewee-3.16.3-1.1.aarch64.rpm"
RPM_HASH = "1c87c5e06b136fe769a921e46a3fdbfe62ba65882322dfd61eee200238df71a569cc70f46aa177676743adb50606e0aeff99d1755e5fd970948be8f039c0b6f1"

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
