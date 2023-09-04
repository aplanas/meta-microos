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

PV = "11.21"

RPM_NAME = "postgresql11-plpython-11.21-1.1.aarch64.rpm"
RPM_HASH = "577bfff498d7e463dffff396e5bbe7880e701cef57e8d16d4ec3eb958e2b9444cf4d2088971122130231f2173978a78c5fa7d1690c39aec324586c65d5c343c5"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql11-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql11-server \
python3"

inherit rpm
