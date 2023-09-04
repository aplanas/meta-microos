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

RPM_NAME = "postgresql-docs-15-2.12.noarch.rpm"
RPM_HASH = "08270a171f764baac43e1f460d31007425b400196f0b4ba5a8db78ff075a753a6176277e16fb01f351d56b9fc915922212dc655c9ec9b1174b4ca880bd6698b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs \
postgresql-docs-noarch"

RDEPENDS:${PN} += "postgresql-docs-implementation"

inherit rpm
