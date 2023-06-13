SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "2.0.15"

RPM_NAME = "python39-SQLAlchemy-2.0.15-1.1.aarch64.rpm"
RPM_HASH = "04df99af03027319aaf066e732706a3190fa5121ed2e1799303cb8435eb06f5e217383350c94f23ef47121af61803e0c6b8f4ee4f27a7371bcf0ae6965402d69"

RPROVIDES:${PN} += "python3.9dist(sqlalchemy) \
python39-SQLAlchemy \
python39-SQLAlchemy(aarch-64) \
python39-sqlalchemy \
python3dist(sqlalchemy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39 \
python39-greenlet \
python39-typing_extensions"

inherit rpm
