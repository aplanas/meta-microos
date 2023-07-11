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

RPM_NAME = "postgresql14-plpython-14.8-1.5.aarch64.rpm"
RPM_HASH = "1f30b3abb02ff30e7868744190885ec53f66cde7410e63bf731eae7320d5fc9d81d57fbc6ecb7bb444a41dac835e278d946e57ba1f96b47dbee218682307fe7a"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql14-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql14-server \
python3"

inherit rpm
