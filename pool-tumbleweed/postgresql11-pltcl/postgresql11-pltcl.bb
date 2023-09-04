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

PV = "11.21"

RPM_NAME = "postgresql11-pltcl-11.21-1.1.aarch64.rpm"
RPM_HASH = "7ceed4b33b330c2a704375ca019a5bedf41a9eebd7ce40258f82aa65e13d8f039fb8b74e0ae49540db48d62c152d5871deabe5c2ba78bc9c27e05298f388100f"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql11-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql11-server \
tcl"

inherit rpm
