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

RPM_NAME = "postgresql12-plpython-12.15-1.5.aarch64.rpm"
RPM_HASH = "d583704d1b117dcddecfb909fe4d65b7395cc74278486e89fee1e90a6be4578c004b00b89271dd80c89aa774e89e7da8e812d27b94c6d0ad80d98e97e135982c"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql12-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql12-server \
python3"

inherit rpm
