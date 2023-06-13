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

RPM_NAME = "python310-SQLAlchemy1-1.4.46-3.1.aarch64.rpm"
RPM_HASH = "819233a734f77ef0430e29cfed1e0449b05f35fef48126e99ce6e226858462b0ecbdaad5ce1e253b4abccfa94f824dd2ec85162d8a9e937f44af43e8556f204f"

RPROVIDES:${PN} += "python3-SQLAlchemy \
python3-SQLAlchemy1 \
python3-sqlalchemy \
python3.10dist(sqlalchemy) \
python310-SQLAlchemy \
python310-SQLAlchemy1 \
python310-SQLAlchemy1(aarch-64) \
python310-sqlalchemy \
python3dist(sqlalchemy)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310 \
python310-greenlet"

inherit rpm
