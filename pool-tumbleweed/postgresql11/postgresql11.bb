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

PV = "11.20"

RPM_NAME = "postgresql11-11.20-1.5.aarch64.rpm"
RPM_HASH = "bc475169c1cbeae0549589898f34ae21d9db731c3bb0f35c38a47338411b8fe7b39e319d3686b0028ae95de0c5e5a52457eb812921b27ec623930e65c1b9a497"

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
