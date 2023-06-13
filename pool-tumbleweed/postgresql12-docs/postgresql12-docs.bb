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

RPM_NAME = "postgresql12-docs-12.15-1.2.noarch.rpm"
RPM_HASH = "c971ce4d9bdd119caab13143fc9c98bdb955dce48d5209cc6b66ec5702512a5ffb8672f650a88d45f8c572a0ba1ab5af0376c12b03f07e9f7ac657483ce8f0a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql12-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
