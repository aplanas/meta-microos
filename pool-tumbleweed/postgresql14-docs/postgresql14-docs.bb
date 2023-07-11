SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql14/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-docs-14.8-1.5.noarch.rpm"
RPM_HASH = "a4dc8915a262f6fe51e5fe6978635f68e60462ed5bf03cdf1e1fafe1e500077a9a190d2103951d10df7d991905982afa825ca315c0e9b4f1ee8eec62d7604c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql14-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
