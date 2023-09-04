SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql14-devel package."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-server-devel-14.8-1.6.aarch64.rpm"
RPM_HASH = "fd629ca49ec3cf68ae362abac09a0508c4cba2f7e227292d8e12c0f036e4fa4207dc25a8a6191ce07e932b7dc345f4ba215da69198e0b720347b7ebddbe294c9"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql14-server-devel"

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
postgresql14-devel \
postgresql14-server \
readline-devel \
zlib-devel"

inherit rpm
