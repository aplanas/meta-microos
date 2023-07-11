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

PV = "13.11"

RPM_NAME = "postgresql13-server-devel-13.11-1.5.aarch64.rpm"
RPM_HASH = "cf1486a16789d823f112d727622dd93df6404a281a099729c30bb2c43bae5a4bbb487210c54ae39ce05ea69f4a2a67434a07dda4300feebe839af0f9e1578c26"

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
