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

RPM_NAME = "python311-SQLAlchemy-2.0.19-3.1.aarch64.rpm"
RPM_HASH = "8318040d03768da5319b848317a893b6b07f05cef201dca663195088bd4c356190015f0d387b90c1f5124d0cef423e508ee490cd31257ca8d8a0cf0bb0961eb5"

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
