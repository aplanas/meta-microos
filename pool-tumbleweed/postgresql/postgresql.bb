SUMMARY = "Basic Clients and Utilities for PostgreSQL"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the basic utility and client programs necessary \
to maintain and work with local or remote PostgreSQL databases as well \
as manual pages for the SQL commands that PostgreSQL supports. Full \
HTML documentation for PostgreSQL can be found in the postgresql-docs \
package."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-15-2.10.noarch.rpm"
RPM_HASH = "6d6efecedd0b03cf78fed21aa97921fef6d2f359f88ca7a9152246e4094a4f9c201239109815cc3294ae0dc098a43cc431a6e8b490f9be4a110c27e45a8b0a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql \
postgresql-noarch"

RDEPENDS:${PN} += "/usr/bin/bash \
postgresql-implementation \
update-alternatives"

inherit rpm
