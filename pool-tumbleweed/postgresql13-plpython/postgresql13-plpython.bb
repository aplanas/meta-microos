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

PV = "13.12"

RPM_NAME = "postgresql13-plpython-13.12-1.1.aarch64.rpm"
RPM_HASH = "e4453f99dca5d04ac551e3ece118191626030cbd26cebd4101f89e1a180b3ce56957c3690bac7a78b46799ff3f4c9f11814b6b7b6465e7746fc85a20811a09c3"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql13-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql13-server \
python3"

inherit rpm
