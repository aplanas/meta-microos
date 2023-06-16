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

PV = "15.3"

RPM_NAME = "postgresql15-server-devel-15.3-1.2.aarch64.rpm"
RPM_HASH = "20c1bac2198cd27227f0fb1265252b4a7581306e826057bd20887553e0d04936b988e47a3fed7f6cad30a0fcfc3c136dcb372e18acaa3d283d48d5ed8ecc5eb2"

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
