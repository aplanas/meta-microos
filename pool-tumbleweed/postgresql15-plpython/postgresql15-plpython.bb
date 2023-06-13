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

PV = "15.3"

RPM_NAME = "postgresql15-plpython-15.3-1.2.aarch64.rpm"
RPM_HASH = "b1d0f2f1e785413a1a91b9764387a185c5a1f1db5affdaa0a9763fc9c915a1f4015b82c6ec542e51667d001c37aa8343f1411b0e18e3c588fc1f708036213c56"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql15-plpython \
postgresql15-plpython(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpython3.10.so.1.0()(64bit) \
postgresql-plpython-noarch \
postgresql15-server \
python3"

inherit rpm
