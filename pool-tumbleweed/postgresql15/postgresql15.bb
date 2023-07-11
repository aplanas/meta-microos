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

PV = "15.3"

RPM_NAME = "postgresql15-15.3-1.5.aarch64.rpm"
RPM_HASH = "5c3aaf737a8b77a69a4895d25df86496b2dba1e0395925019bb8e2d64029182412a71966511520f0be59be7a84eae20b26a98232a3bedfae38e6882a607c0fa8"

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
