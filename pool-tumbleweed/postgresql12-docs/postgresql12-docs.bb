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

PV = "12.15"

RPM_NAME = "postgresql12-docs-12.15-1.5.noarch.rpm"
RPM_HASH = "4ce8c9a7526667c894924367134efb7dfe9bea9b42b43e408f99a26f757f9dc63bc9873e7e868e1794225419ec88d6f59934428da39ed2b66d90d639ec5804d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql12-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
