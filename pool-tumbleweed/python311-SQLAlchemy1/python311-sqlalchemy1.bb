SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "1.4.46"

RPM_NAME = "python311-SQLAlchemy1-1.4.46-3.3.aarch64.rpm"
RPM_HASH = "df71d777114f8fe7ef1fac2fb3049e30e8cd16fed78f909e85c177a98e1e2cfb8db6f03cb6f734643a935998c80079f7917bd5ad61c3364651b3573b40a7fa96"

RPROVIDES:${PN} += "python3-SQLAlchemy \
python3-SQLAlchemy1 \
python3-sqlalchemy \
python3.11dist-sqlalchemy \
python311-SQLAlchemy \
python311-SQLAlchemy1 \
python311-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311 \
python311-greenlet"

inherit rpm
