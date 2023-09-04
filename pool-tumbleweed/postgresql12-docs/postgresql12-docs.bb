SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql12/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "12.16"

RPM_NAME = "postgresql12-docs-12.16-1.1.noarch.rpm"
RPM_HASH = "f05acc2b7298b9df32d1680f27b619cc6c1db22a4b179063317711d83a46d342bb1d100dbca72651ac2938875c1c2fd42daf9ef4e7e7d86336abba856613397e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql12-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
