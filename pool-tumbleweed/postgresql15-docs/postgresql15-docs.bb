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

PV = "15.4"

RPM_NAME = "postgresql15-docs-15.4-1.1.noarch.rpm"
RPM_HASH = "d4c6cd7e0a95444178eea264347eb3ded8f640e6d2ee2dacdb17a8ab7d9b1dc35d6875751d0aaf6b3464f2c389401848365d00035e7452d90ebbacb1dfa3235c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql15-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
