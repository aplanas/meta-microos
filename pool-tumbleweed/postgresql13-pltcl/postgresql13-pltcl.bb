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

RPM_NAME = "postgresql13-pltcl-13.11-1.5.aarch64.rpm"
RPM_HASH = "3f6b2f2a65d602bb2ec0eb7c2f092ab05657cba1b20e5d04f08de95fa9fefb8e1b2dc83be9d9d573e8b3e240c4dc8ba9b6c2833df3db545555ec51e3de0e5acc"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql13-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql13-server \
tcl"

inherit rpm
