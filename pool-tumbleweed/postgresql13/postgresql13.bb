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

PV = "13.11"

RPM_NAME = "postgresql13-13.11-1.2.aarch64.rpm"
RPM_HASH = "0139983d5ecfd35f45048077b199ce57d507d2545c52cb2969377a7a0c5beacf5ccae436e8ea21477fb77b3bec3ea2986795debae59f74559c94b9b218ad6d71"

RPROVIDES:${PN} += "postgresql \
postgresql-implementation \
postgresql13"

RDEPENDS:${PN} += "/bin/sh \
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
