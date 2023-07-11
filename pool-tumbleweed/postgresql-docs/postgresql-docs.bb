SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-docs-15-2.10.noarch.rpm"
RPM_HASH = "ea3d00303993794672403189c2030ea3ad91f55cfedd9c467bb8be4e0c4109e4ded1781728c9723a4d6a98138f4cfde71787aa37bc37c7cc80861c16fd3c07a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs \
postgresql-docs-noarch"

RDEPENDS:${PN} += "postgresql-docs-implementation"

inherit rpm
