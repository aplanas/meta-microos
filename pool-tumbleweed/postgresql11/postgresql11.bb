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

PV = "11.21"

RPM_NAME = "postgresql11-11.21-1.1.aarch64.rpm"
RPM_HASH = "1ee2be3bd4fe78fbceb5dc7de49e6156ee4ce6883de223e44c7b35ced4ccc792894b476861739dfc9d6f74fcb46bec0198c7b0f3cd4a530903ed4b63f86c3aaa"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql11"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpq.so.5 \
libpq5 \
libreadline.so.8 \
libz.so.1 \
postgresql-noarch"

inherit rpm
