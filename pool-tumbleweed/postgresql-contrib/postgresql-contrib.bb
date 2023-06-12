SUMMARY = "Contributed Extensions and Additions to PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
The postgresql-contrib package includes extensions and additions that \
are distributed along with the PostgreSQL sources, but are not (yet) \
officially part of the PostgreSQL core. \
 \
Documentation for the modules contained in this package can be found in \
/usr/share/doc/packages/postgresql/contrib."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-contrib-15-2.7.noarch.rpm"
RPM_HASH = "2e14efa830ce1c804801ad07435efe39b94a5f17091cd271696082880886d9d927b8fac7dfbcd84fc92456e52fcb7f5537710f949ccecfd0523b144c3f342869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-contrib \
postgresql-contrib-noarch"
RDEPENDS:${PN} += "postgresql-contrib-implementation"

inherit rpm
