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

RPM_NAME = "postgresql-contrib-15-2.10.noarch.rpm"
RPM_HASH = "f4e1afb5a535bc721f9ad78cdc2050d669b205c3427808e054f440bfe44672e2b12b64b5e84795f46d24bea7b62b274ed88f6b381bc3dab21961b2e9855c47b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-contrib \
postgresql-contrib-noarch"

RDEPENDS:${PN} += "postgresql-contrib-implementation"

inherit rpm
