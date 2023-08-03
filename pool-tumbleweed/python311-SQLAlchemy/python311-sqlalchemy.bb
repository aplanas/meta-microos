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

RPM_NAME = "python311-SQLAlchemy-2.0.19-1.1.aarch64.rpm"
RPM_HASH = "21beaf0fff57bbeef0afc72fdb232155e5588b608944837dac0192328dc100ce0574dd538a1bc64730e43288b184310dad56f0291d014b131128b07530553d29"

RPROVIDES:${PN} += "python3-SQLAlchemy \
python3-sqlalchemy \
python3.11dist-sqlalchemy \
python311-SQLAlchemy \
python311-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311 \
python311-greenlet \
python311-typing-extensions"

inherit rpm
