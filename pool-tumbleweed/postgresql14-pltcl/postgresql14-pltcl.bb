SUMMARY = "PL/Tcl Procedural Language for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Tcl procedural language for PostgreSQL. \
With thie module one can use Tcl to write stored procedures, functions, \
and triggers. \
 \
PostgreSQL also offers the built-in procedural language PL/SQL which is \
included in the postgresql-server package."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-pltcl-14.8-1.6.aarch64.rpm"
RPM_HASH = "77f2df8f2c2e04be99d93cac1a9e6610a9fbdd1cfb4c48df337794c916ea91c8c5b8b661c0072318c6f7360ffbb660ea29e89708b4f40830131285ed7877cc31"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql14-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql14-server \
tcl"

inherit rpm
