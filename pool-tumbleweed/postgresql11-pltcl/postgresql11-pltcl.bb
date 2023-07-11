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

RPM_NAME = "postgresql11-pltcl-11.20-1.5.aarch64.rpm"
RPM_HASH = "a57b2218049f4bbeae54bfe3552dce0977ed40c5b49890d56ddddd36ad3298c6a9f228f6d921e83d7a811b69b1f37a24f16449ec35407a05b4695ead860f70aa"

RPROVIDES:${PN} += "postgresql-pltcl-implementation \
postgresql11-pltcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtcl8.6.so \
postgresql-pltcl-noarch \
postgresql11-server \
tcl"

inherit rpm
