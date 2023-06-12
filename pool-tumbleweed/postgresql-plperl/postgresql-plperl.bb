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

RPM_NAME = "postgresql-plperl-15-2.7.noarch.rpm"
RPM_HASH = "2242914f1d1b12d3f8d9ae14aceb7142147e31312ab80902a9cce0a8e29ad6f6206f5e7718ad18a4599bab542bcaa0a352be33d85014de34045a73f66f61d928"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plperl \
postgresql-plperl-noarch"
RDEPENDS:${PN} += "postgresql-plperl-implementation"

inherit rpm
