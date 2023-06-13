SUMMARY = "The PL/Python Procedural Languages for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Python procedural language for PostgreSQL. \
With this module one can use Python to write stored procedures, \
functions, and triggers. \
 \
PostgreSQL also offers the built-in procedural language PL/SQL which is \
included in the postgresql-server package."
LICENSE = "PostgreSQL"

PV = "13.11"

RPM_NAME = "postgresql13-plpython-13.11-1.2.aarch64.rpm"
RPM_HASH = "90137e31f3768df9c30076947f36377f226431fd466bb6f4b958effea98f59e84acb46b4c1120afa391a14f03af04b409fd59570812122456fc27cdd71e4bce4"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql13-plpython \
postgresql13-plpython(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpython3.10.so.1.0()(64bit) \
postgresql-plpython-noarch \
postgresql13-server \
python3"

inherit rpm
