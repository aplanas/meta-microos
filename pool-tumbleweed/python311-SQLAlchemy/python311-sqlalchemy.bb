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

RPM_NAME = "python311-SQLAlchemy-2.0.19-2.1.aarch64.rpm"
RPM_HASH = "bd9065218e632fe0e56d1ce433ae2be6587897b7d8fa67fc320dcf614133c80b7c45b7399695c75700650e8d52d550fb7525ddf468cc1be550015ff461dce7e9"

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
