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

PV = "14.8"

RPM_NAME = "postgresql14-14.8-1.6.aarch64.rpm"
RPM_HASH = "ec20f96bb15b88bed9a4661ada947bf50edc6e8feafce73487b02a8c3520baeeb9c36f622bd75e6b5fda9d1c318273b23cf266ea3df284dfc2ee1d48c459ca82"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql14"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpq.so.5 \
libpq5 \
libreadline.so.8 \
libz.so.1 \
postgresql-noarch"

inherit rpm
