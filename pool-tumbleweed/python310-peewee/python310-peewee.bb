SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.15.4"

RPM_NAME = "python310-peewee-3.15.4-1.6.aarch64.rpm"
RPM_HASH = "76e952cf5724e716a6abcd384870a1b07f537ce267edde680cb5954ba58a928649a5cad2693d67b8acc12552fe94facb384bb34d94cce4c069786a7395748f6b"

RPROVIDES:${PN} += "python3-peewee \
python3.10dist(peewee) \
python310-peewee \
python310-peewee(aarch-64) \
python3dist(peewee)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
python(abi) \
update-alternatives"

inherit rpm
