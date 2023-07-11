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

RPM_NAME = "python39-SQLAlchemy1-1.4.46-3.3.aarch64.rpm"
RPM_HASH = "0a92036e841a7faa2322f0a29626e50ce4416404edf39b9785143dc4a0a7a6d3ca0d8447bdd7567f5a440157f54676aa7341d8ff297a2a4a4a8107e185ec8206"

RPROVIDES:${PN} += "python3.9dist-sqlalchemy \
python39-SQLAlchemy \
python39-SQLAlchemy1 \
python39-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39 \
python39-greenlet"

inherit rpm
