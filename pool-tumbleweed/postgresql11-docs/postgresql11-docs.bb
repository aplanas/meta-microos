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

RPM_NAME = "postgresql11-docs-11.20-1.2.noarch.rpm"
RPM_HASH = "59f39d87f3324324ca0cd5122b17b9347edfd901c352e20ac1984389162f7e73ac7a18f8e1317f0d11ebeb405b5dad5debbdfaceadb1fc945e045f2b2be7a4fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql11-docs"
RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
