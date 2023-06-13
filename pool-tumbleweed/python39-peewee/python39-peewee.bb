SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.15.4"

RPM_NAME = "python39-peewee-3.15.4-1.6.aarch64.rpm"
RPM_HASH = "7b8ccefa13b474993199f3f05f012251382f2dc1448367c5b7c449b6f6f7827876dc58b93afedc78c68994c989ae0f052f24c20d78321957cd6e0fdd43632e90"

RPROVIDES:${PN} += "python3.9dist(peewee) \
python39-peewee \
python39-peewee(aarch-64) \
python3dist(peewee)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsqlite3.so.0()(64bit) \
python(abi) \
update-alternatives"

inherit rpm
