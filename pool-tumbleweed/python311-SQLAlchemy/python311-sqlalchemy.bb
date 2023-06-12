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

RPM_NAME = "python311-SQLAlchemy-2.0.15-1.1.aarch64.rpm"
RPM_HASH = "0b7d25ee379f61a1ab0b0d4a7ecb1152140981622dea8a65ffd26f75355ad50f47dd961b0eeeebb68817efbc3d9534f4ae255063c9add55d439a8b77f0d24386"

RPROVIDES:${PN} += "python3.11dist(sqlalchemy) \
python311-SQLAlchemy \
python311-SQLAlchemy(aarch-64) \
python311-sqlalchemy \
python3dist(sqlalchemy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311 \
python311-greenlet \
python311-typing_extensions"

inherit rpm
