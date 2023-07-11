SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "1.4.46"

RPM_NAME = "python310-SQLAlchemy1-1.4.46-3.3.aarch64.rpm"
RPM_HASH = "5c5cabcc9da435637a2fec170e85cc81c9a6262318763236dda8af9297d19005ffae8455eebf88c34039b83214cbf5a70b26d0ce1531cdac0ee9b6c0c4fa8943"

RPROVIDES:${PN} += "python3.10dist-sqlalchemy \
python310-SQLAlchemy \
python310-SQLAlchemy1 \
python310-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310 \
python310-greenlet"

inherit rpm
