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

RPM_NAME = "postgresql14-docs-14.8-1.6.noarch.rpm"
RPM_HASH = "040de12f7d6c51778918996c0102dca83d4ca93e0078433a1d58f6013c4e5563d1c1c3c6d084f1e72c49c51f98fe8a841e6b0a2664d169d7dbd9a7860e18dd02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql14-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
