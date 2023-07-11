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

RPM_NAME = "postgresql-pltcl-15-2.10.noarch.rpm"
RPM_HASH = "1da9b139457708be4d8a3ece5e53d4c7b3012dc446d531f8c12e1e1adc4833be34013d4357bbf916d36ee7ba9f0b1bcb0d30114ce07bb770e85d3201c0da12ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-pltcl \
postgresql-pltcl-noarch"

RDEPENDS:${PN} += "postgresql-pltcl-implementation"

inherit rpm
