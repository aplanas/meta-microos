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

PV = "13.12"

RPM_NAME = "postgresql13-pltcl-13.12-1.1.aarch64.rpm"
RPM_HASH = "0b18b79cf99f577d9c5e838dfa8790016ed7503a0f288b2a707797e9d04b68258c935568523e4bb2bc86c932c34639c50052dc210264dd60a4b0d48aa18b71ee"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql13-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql13-server \
tcl"

inherit rpm
