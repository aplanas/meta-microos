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

PV = "15.4"

RPM_NAME = "postgresql15-pltcl-15.4-1.1.aarch64.rpm"
RPM_HASH = "50630673d08cdea1e15d69494d35738a4a9538ab5e5b67acf63b0049dbd09da0b816a259f6aa4ccb682cb3a06b60b80d7d90fdcf5603bf3437c9c12a4d900b0b"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql15-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql15-server \
tcl"

inherit rpm
