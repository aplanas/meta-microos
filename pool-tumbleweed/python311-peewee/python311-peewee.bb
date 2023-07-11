SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "BSD-3-Clause"

PV = "3.16.2"

RPM_NAME = "python311-peewee-3.16.2-1.3.aarch64.rpm"
RPM_HASH = "a1081be0a240d75bc66d0fd6b4ab52bceefa2c1ea5b6d45a7735192c096987928a091cb299b24a083801828bf0ac0eea97a56c64ea7a1fe99d5ce7632c92d76c"

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
