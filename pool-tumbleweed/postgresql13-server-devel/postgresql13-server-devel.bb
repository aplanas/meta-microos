SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql13-devel package."
LICENSE = "PostgreSQL"

PV = "13.12"

RPM_NAME = "postgresql13-server-devel-13.12-1.1.aarch64.rpm"
RPM_HASH = "905cde3518d98a2dc93d296cdd606da7901592c96d59ebfc1c47f25cbe818878861a46875da783368a1a5960951f1f3a9499eaeb559c263a4ce900a9a9f6cb85"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql13-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux-devel \
libxslt-devel \
openssl-devel \
pam-devel \
pkgconfig-krb5 \
postgresql-server-devel-noarch \
postgresql13-devel \
postgresql13-server \
readline-devel \
zlib-devel"

inherit rpm
