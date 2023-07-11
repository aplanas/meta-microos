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

RPM_NAME = "postgresql-plperl-15-2.10.noarch.rpm"
RPM_HASH = "c695df934035fae42c8dfc0587d064d48a23ec1820f1d1d79eb90cacda3d3941eb16a64ca486c93751fb4c8ab6c9ed5ee449b4c38694325731177cfc11426ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-plperl \
postgresql-plperl-noarch"

RDEPENDS:${PN} += "postgresql-plperl-implementation"

inherit rpm
