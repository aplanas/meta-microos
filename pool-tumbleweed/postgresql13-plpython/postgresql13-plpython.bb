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

RPM_NAME = "postgresql13-plpython-13.11-1.5.aarch64.rpm"
RPM_HASH = "3d04267f141ab1d1d1cb331a4358d4c3d55e8552ef55031e64cd826ebff5febbc93cd25a3765f25b654130ecf7e6ab888c6ee6bc80d25c8ec6776fb9cabba307"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql13-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql13-server \
python3"

inherit rpm
