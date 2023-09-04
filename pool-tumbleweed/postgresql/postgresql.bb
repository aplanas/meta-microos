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

RPM_NAME = "postgresql-15-2.12.noarch.rpm"
RPM_HASH = "1303de615afb7114b1a41d2f2efafbc1c24ae0373535c5e41b09c8e94560e5b44242faea956d67a575ed57d1b067d0998f65ad2f316129a4db88404f4e892a2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql \
postgresql-noarch"

RDEPENDS:${PN} += "/usr/bin/bash \
postgresql-implementation \
update-alternatives"

inherit rpm
