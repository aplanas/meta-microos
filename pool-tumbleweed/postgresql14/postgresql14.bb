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

RPM_NAME = "postgresql14-14.8-1.2.aarch64.rpm"
RPM_HASH = "aa5b69d4c0535f50fd9bd474a7e96cd3d44c8c035a9d97174f042b92f8037f88ef53ec5a9d72d3e2616e884d2fb0e6e47703a0ed8081f796c33dc629e66db737"

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
