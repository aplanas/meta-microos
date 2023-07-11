SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql11/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-docs-11.20-1.5.noarch.rpm"
RPM_HASH = "9cd2f4bf6d464adb68738f50762392a9545195e20cd866ca0507ae5bfad530e66ac727a37120405da92923d71643a30229a28d9260aa9df1f55c53e584c3432c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql11-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
