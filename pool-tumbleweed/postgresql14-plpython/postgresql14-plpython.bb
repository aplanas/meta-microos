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

RPM_NAME = "postgresql14-plpython-14.8-1.6.aarch64.rpm"
RPM_HASH = "b74c8d38179496fd137cc6af6f0562c6c94fbd6df5978878e438e698173470d1a5480a6332fa79bacb5610f573c243a46c5b1ec3f0a7d9825ab57499d1dcd703"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql14-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql14-server \
python3"

inherit rpm
