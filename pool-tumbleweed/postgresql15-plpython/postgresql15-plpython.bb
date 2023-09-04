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

PV = "15.4"

RPM_NAME = "postgresql15-plpython-15.4-1.1.aarch64.rpm"
RPM_HASH = "b852c20622351f82e7b33080a54cf39d32a3a7221778945c9bac67d883c8ef5c0af5fdb2a6571f2c9f60fdde1fe4c0695e675feae9167f250b19b01db10ce2f3"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql15-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql15-server \
python3"

inherit rpm
