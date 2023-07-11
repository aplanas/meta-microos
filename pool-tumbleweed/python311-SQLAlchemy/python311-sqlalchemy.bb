SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "2.0.16"

RPM_NAME = "python311-SQLAlchemy-2.0.16-1.1.aarch64.rpm"
RPM_HASH = "1e4927c7d98c34170f689413f32c131d59b12ce755e0f2af638e7a0f1e628608ff5e6c6c58a0d82b48e9d97dda503857e7586e622547d74009040147945697c2"

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
