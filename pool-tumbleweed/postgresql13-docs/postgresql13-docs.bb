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

PV = "13.11"

RPM_NAME = "postgresql13-docs-13.11-1.5.noarch.rpm"
RPM_HASH = "110a1df03ecc6aba6590655d7d518d1cb6f0067fcf56ffb5ae0d4853fe6637f81e2296152af57b90a939a9f0023a887244516f5a3182baa6de8fcc651a28ee47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql13-docs"

RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
