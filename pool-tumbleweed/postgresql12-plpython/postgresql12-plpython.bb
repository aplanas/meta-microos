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

PV = "12.15"

RPM_NAME = "postgresql12-plpython-12.15-1.2.aarch64.rpm"
RPM_HASH = "9eb9a7c66b62bcf6458b275d781d618660553e58b4a189d40487e4e14d271fa11e6aca737755727bd35f0aba6bbc91340c86609dae1364b4934567f454fc9fef"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql12-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.10.so.1.0 \
postgresql-plpython-noarch \
postgresql12-server \
python3"

inherit rpm
