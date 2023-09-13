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

RPM_NAME = "python310-SQLAlchemy-2.0.19-3.1.aarch64.rpm"
RPM_HASH = "2f748999d5af94cb60e8ef3b3f550ba04bd652fe5e90ea173205df6ce8ed42f51827da6b8de85aa7d53295fcfa8a2c7ac6cf6a333067e9750088f0c7b654736e"

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
