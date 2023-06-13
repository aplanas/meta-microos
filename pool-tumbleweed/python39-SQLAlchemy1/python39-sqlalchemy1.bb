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

RPM_NAME = "python39-SQLAlchemy1-1.4.46-3.1.aarch64.rpm"
RPM_HASH = "152aff567438fb016db1c7572087ed4c42f083e69e3cdf7efc17e1707419a7c5b339547af61d0370be2cdbab40cd78ee9d40785a85e66ddd925e6804ccc31cfb"

RPROVIDES:${PN} += "python3.9dist(sqlalchemy) \
python39-SQLAlchemy \
python39-SQLAlchemy1 \
python39-SQLAlchemy1(aarch-64) \
python39-sqlalchemy \
python3dist(sqlalchemy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python39 \
python39-greenlet"

inherit rpm
