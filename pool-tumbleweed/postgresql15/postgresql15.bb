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

PV = "15.4"

RPM_NAME = "postgresql15-15.4-1.1.aarch64.rpm"
RPM_HASH = "cff7c52ab3d66beda6e097ef46df466559706790f2609fd8ad6574bd19a064752cbe03c81824f5d5d36311eea45d61fd7ddf33ae9cdf259ed383cef737047df3"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql15"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
libm.so.6 \
libpq.so.5 \
libpq5 \
libreadline.so.8 \
libz.so.1 \
libzstd.so.1 \
postgresql-noarch"

inherit rpm
