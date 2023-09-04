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

PV = "12.16"

RPM_NAME = "postgresql12-plpython-12.16-1.1.aarch64.rpm"
RPM_HASH = "75a5ab1717b5a5aa7da9e83e82f1459015221870cb1357b1bafafee35dbf0f2c2b46b90ced3b383c0e44e4f6b5180b05773430787f9d8b7239d9a7493dcec091"

RPROVIDES:${PN} += "postgresql-plpython-implementation \
postgresql12-plpython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0 \
postgresql-plpython-noarch \
postgresql12-server \
python3"

inherit rpm
