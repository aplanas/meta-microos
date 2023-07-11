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

PV = "12.15"

RPM_NAME = "postgresql12-pltcl-12.15-1.5.aarch64.rpm"
RPM_HASH = "fe8a6b1daf37792ad4d918ed2fcd8b8967dfab5d87b258734792852757184965533522928bb100de9637fdda763762501bef6389977ce70458772f7c1fe2ef7c"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql12-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql12-server \
tcl"

inherit rpm
