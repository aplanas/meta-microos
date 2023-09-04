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

RPM_NAME = "postgresql-contrib-15-2.12.noarch.rpm"
RPM_HASH = "bcbe0fc760ee2ec01b327447ba530640d06fcc0190eb8c36d80109a14c85aa735de73bcddad391f6b02fe0661affdbec5b302f2154c81e3bd8d96a49e0163acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-contrib \
postgresql-contrib-noarch"

RDEPENDS:${PN} += "postgresql-contrib-implementation"

inherit rpm
