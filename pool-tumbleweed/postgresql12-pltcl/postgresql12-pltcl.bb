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

RPM_NAME = "postgresql12-pltcl-12.15-1.2.aarch64.rpm"
RPM_HASH = "86ad8eb056966274241f6ada186b981782e106130ad5897e62844d58451198a7d60123afeed01b9f1de583b353b38b32737717fcb33cfe4b2e5b6a6329e4f1ad"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql12-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql12-server \
tcl"

inherit rpm
