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

RPM_NAME = "postgresql15-plpython-15.3-1.5.aarch64.rpm"
RPM_HASH = "c5df2ad8f284258792e048c0c5903d5527e889301de814b247039c421db08f45b921df57e7a3bfe75289e96b92a494e55dd72dd28810334244f974b1c5eb29de"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql15-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql15-server \
python3"

inherit rpm
