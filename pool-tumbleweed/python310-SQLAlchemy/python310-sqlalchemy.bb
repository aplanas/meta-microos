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

RPM_NAME = "python310-SQLAlchemy-2.0.16-1.1.aarch64.rpm"
RPM_HASH = "6e3d876068c91340b24f075f6914b944862510071960b612bae2eb0f5b36c3c6b69e2757276481f9f58792fdaee2ec064e272fcda9486db1dc68f163c973c332"

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
