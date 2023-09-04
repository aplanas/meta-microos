SUMMARY = "PL/Tcl Procedural Language for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Tcl procedural language for PostgreSQL. \
With thie module one can use Tcl to write stored procedures, functions, \
and triggers."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-pltcl-15-2.12.noarch.rpm"
RPM_HASH = "b1919da76a10775169748d36ed33ec02b09e3013dd8c0a1fc243e3b8842acdf40f0558c55c7c1b31b470ab184837561ef5371099debda739f53725238bf7b870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-pltcl \
postgresql-pltcl-noarch"

RDEPENDS:${PN} += "postgresql-pltcl-implementation"

inherit rpm
