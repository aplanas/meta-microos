SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "2.0.19"

RPM_NAME = "python310-SQLAlchemy-2.0.19-1.1.aarch64.rpm"
RPM_HASH = "1352eb1cce6655c11029e3dd4b552ac30d3a6ea4bce1523a3f79459ffb832fff1c6f8d34ece7aa2925414445a89cb51614ac628d81df21380511c68235eb4a24"

RPROVIDES:${PN} += "python3.10dist-sqlalchemy \
python310-SQLAlchemy \
python310-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310 \
python310-greenlet \
python310-typing-extensions"

inherit rpm
