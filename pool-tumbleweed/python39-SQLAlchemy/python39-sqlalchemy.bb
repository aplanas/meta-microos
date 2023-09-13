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

RPM_NAME = "python39-SQLAlchemy-2.0.19-3.1.aarch64.rpm"
RPM_HASH = "54bf42861539774ff722282cc45768e4e0f9563aab4cb57dc25afa75b3b8ecf46ac606cb44a9b236c227c56026d27c21664ea073b32966f8e13f09150ae0b265"

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
