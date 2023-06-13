SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql15/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "15.3"

RPM_NAME = "postgresql15-docs-15.3-1.2.noarch.rpm"
RPM_HASH = "3fe33cb5e216ad82f656e0ca081c03826dd7abfac89592bd7d0f6e3ccbc7dbbd4b9c7d17251eaf3d04b5eedc85ec886c898fa956bf565c3cec127f807b3b1d74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql15-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
