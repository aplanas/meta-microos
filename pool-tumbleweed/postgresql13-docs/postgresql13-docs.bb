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

RPM_NAME = "postgresql13-docs-13.11-1.2.noarch.rpm"
RPM_HASH = "3fc927c8433f5ee089ca51481ff13e2842407ec520a52472c726c396c440339a959b2b5e71fac8482aad125adb9acf8b2f62893d0c3db32711dc40cecf332f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-docs-implementation \
postgresql13-docs"
RDEPENDS:${PN} += "postgresql-docs-noarch"

inherit rpm
