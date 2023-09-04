SUMMARY = "The PL/Tcl, PL/Perl, and  PL/Python procedural languages for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the PL/Perl procedural language for PostgreSQL. \
With this module one can use Perl to write stored procedures, \
functions, and triggers."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-plperl-15-2.12.noarch.rpm"
RPM_HASH = "9d9dedd591e463e9dc95540312fcd3075345568bc4263676732fab584696610284a68f148438bbbf638a4305bef786fe9d5a487766498bd23e5aaf36de774437"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plperl \
postgresql-plperl-noarch"

RDEPENDS:${PN} += "postgresql-plperl-implementation"

inherit rpm
