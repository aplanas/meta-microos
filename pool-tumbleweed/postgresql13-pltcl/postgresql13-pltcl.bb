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

PV = "13.11"

RPM_NAME = "postgresql13-pltcl-13.11-1.2.aarch64.rpm"
RPM_HASH = "eda0e5309fe1c7b769feff3f4477b4a032382bc51c8af1498b9d0274f7ade0296301b4424e6a99c7cdb7d5ce9166b056d6ff58a79f1b9961f9b3d75a0957e054"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql13-pltcl \
postgresql13-pltcl(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libtcl8.6.so()(64bit) \
postgresql-pltcl-noarch \
postgresql13-server \
tcl"

inherit rpm
