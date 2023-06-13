SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.15.4"

RPM_NAME = "python311-peewee-3.15.4-1.6.aarch64.rpm"
RPM_HASH = "9f158fae908672fce17aa299d719da6cbcdb150657f08af16cbe26eab94503ee4d45d54f91e150ae208070525be5a7ad4b97fe679bbd45b1aaadb1a26fda4a43"

RPROVIDES:${PN} += "python3.11dist(peewee) \
python311-peewee \
python311-peewee(aarch-64) \
python3dist(peewee)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsqlite3.so.0()(64bit) \
python(abi) \
update-alternatives"

inherit rpm
