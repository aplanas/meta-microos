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

PV = "14.8"

RPM_NAME = "postgresql14-plpython-14.8-1.2.aarch64.rpm"
RPM_HASH = "7ba2e4b8dc3a65ce4fc7a111fb6552e35661f4a3731d8e078c98953c6dc8515807419897c064e91c4b9b554400f9d5c6635c837367352a1e9272eed9e657de62"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql14-plpython \
postgresql14-plpython(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
postgresql-plpython-noarch \
postgresql14-server \
python3"

inherit rpm
