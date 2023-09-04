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

PV = "12.16"

RPM_NAME = "postgresql12-pltcl-12.16-1.1.aarch64.rpm"
RPM_HASH = "0d248d28b64f7ca9200f4c930afa84e2a59cfeabcf117ff0775974bc06e926135f4d1671608f98f7737ec17f86eed32f5ad75034016f425b84403d166edd9f77"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql12-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql12-server \
tcl"

inherit rpm
