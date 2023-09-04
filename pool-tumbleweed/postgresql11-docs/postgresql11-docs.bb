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

PV = "11.21"

RPM_NAME = "postgresql11-docs-11.21-1.1.noarch.rpm"
RPM_HASH = "1e7288c80b9dde2ec69398d68297cc21d6611de6a616da2db8ed11e01593be256ec40d52e8b961651a4e7b2f77b534f33290e555aa7a79cbf7b7ad927af06252"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql11-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
