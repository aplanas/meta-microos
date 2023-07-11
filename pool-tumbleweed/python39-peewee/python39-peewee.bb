SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.16.2"

RPM_NAME = "python39-peewee-3.16.2-1.3.aarch64.rpm"
RPM_HASH = "399072479d396d4dcfcc4a98f2feeebb202b644be69bfee960de85a07214bfb4e518a6cb7ab69bf90851bc22e9244f6644418c3a30b1f78651fc47256a3238ae"

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
