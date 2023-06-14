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

PV = "11.20"

RPM_NAME = "postgresql11-pltcl-11.20-1.2.aarch64.rpm"
RPM_HASH = "e9ad97d72772413c7a6a89c4a27d132813bf175fd05672f66ce4934145e3f9bace3444ca5d7b7d5db752c2685d53bba0157782acafe91ae46d2177f153e76b62"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql11-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql11-server \
tcl"

inherit rpm
