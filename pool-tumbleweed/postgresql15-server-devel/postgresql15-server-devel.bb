SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql15-devel package."
LICENSE = "PostgreSQL"

PV = "15.4"

RPM_NAME = "postgresql15-server-devel-15.4-1.1.aarch64.rpm"
RPM_HASH = "207d73c7d077590c1374c3f727585caf1ba6c08024afc0a9de92f507d5d691ac7b9612b414103436bb09f3aa885b34693e39c5953207dadaafdfeb29a48836a6"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql15-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
libselinux-devel \
libxslt-devel \
openssl-devel \
pam-devel \
pkgconfig-krb5 \
postgresql-server-devel-noarch \
postgresql15-devel \
postgresql15-server \
readline-devel \
zlib-devel"

inherit rpm
