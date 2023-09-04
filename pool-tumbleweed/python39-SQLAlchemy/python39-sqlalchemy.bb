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

RPM_NAME = "python39-SQLAlchemy-2.0.19-2.1.aarch64.rpm"
RPM_HASH = "f0e57c6caf0d97533a02cc6714ffd4784a05516fa845dd3f1718c97eeece17f6837d1365ae5c40ae7d59d6691dcfc403554a7f5eaf25cecbd3c4edd3920862c1"

RPROVIDES:${PN} += "python3.9dist-sqlalchemy \
python39-SQLAlchemy \
python39-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39 \
python39-greenlet \
python39-typing-extensions"

inherit rpm
