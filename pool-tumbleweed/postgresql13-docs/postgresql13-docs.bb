SUMMARY = "HTML Documentation for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the HTML documentation for PostgreSQL. The start \
page is: file:///usr/share/doc/packages/postgresql13/html/index.html . \
Manual pages for the PostgreSQL SQL statements can be found in the \
postgresql package."
LICENSE = "PostgreSQL"

PV = "13.12"

RPM_NAME = "postgresql13-docs-13.12-1.1.noarch.rpm"
RPM_HASH = "11803986f02a46409d83fa794d4919413dea6af1c981294cb014496851040028b4a1ffdfb0e988d5765a1dfa56b1c53b2ae3ebc650e4b49925a78e1e2c31bcf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql13-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
