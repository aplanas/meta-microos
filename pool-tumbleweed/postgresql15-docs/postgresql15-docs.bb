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

RPM_NAME = "postgresql15-docs-15.3-1.5.noarch.rpm"
RPM_HASH = "cb2b36327bbfbda72acb30b14fe4ed429abb92de179c0907353ca09fac0128169b4bee97d47f69d4ee9b78fa8c662ac0e812401ec1df7c28d3277e6a8514f689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql15-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
