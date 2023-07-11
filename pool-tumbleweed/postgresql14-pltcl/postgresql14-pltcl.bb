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

RPM_NAME = "postgresql14-pltcl-14.8-1.5.aarch64.rpm"
RPM_HASH = "04ec0e67f11d0f179ac917ad58d80ac8487cb2f23b5a1b74a246772d327bf7398ce5c1f51847d3cb3757d3960ec2831e568d04072c5c8cb8fac86334cd1af167"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql14-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql14-server \
tcl"

inherit rpm
