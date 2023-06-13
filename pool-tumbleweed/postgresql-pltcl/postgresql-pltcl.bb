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

RPM_NAME = "postgresql-pltcl-15-2.7.noarch.rpm"
RPM_HASH = "814aa091bb7959dec44dc703c97edadcab507c1bba6315ba768958216206b772298d1788d010b14396f1571aeb234403b935363957e3e04ba12b459c4a3ebd8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-pltcl \
postgresql-pltcl-noarch"

RDEPENDS:${PN} += "postgresql-pltcl-implementation"

inherit rpm
