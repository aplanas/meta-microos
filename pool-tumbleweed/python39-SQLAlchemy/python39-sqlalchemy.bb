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

RPM_NAME = "python39-SQLAlchemy-2.0.19-1.1.aarch64.rpm"
RPM_HASH = "a582faa04589b252228bf963f0e3264112e4c45c0d394901119ddd2ca0e131b631dc0b567f3783877a34aac2a811b1b34860887d3d64a38ed1059a017cc5cad5"

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
