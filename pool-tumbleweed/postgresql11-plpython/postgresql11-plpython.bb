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

PV = "11.20"

RPM_NAME = "postgresql11-plpython-11.20-1.5.aarch64.rpm"
RPM_HASH = "50e5eaedfe1ab551bde747c3e0358e6a0b14fdd726752d5edcbe73b8e424993ccfd708a653a3cd83ceb24169ec4691faa08a0a7c09f0f069e7d9720d9617824b"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql11-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql11-server \
python3"

inherit rpm
