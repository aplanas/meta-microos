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

PV = "15.3"

RPM_NAME = "postgresql15-pltcl-15.3-1.5.aarch64.rpm"
RPM_HASH = "23d84fadee5c576005282aaaeda9e4b0292afc2bb16c8d33588ec5686fd7c093ce50899bbc56b6262e7097b9315f5243591695175d7e2a838aeb996f5a1b0472"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql15-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql15-server \
tcl"

inherit rpm
