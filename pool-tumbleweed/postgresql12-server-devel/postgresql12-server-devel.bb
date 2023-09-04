SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql12-devel package."
LICENSE = "PostgreSQL"

PV = "12.16"

RPM_NAME = "postgresql12-server-devel-12.16-1.1.aarch64.rpm"
RPM_HASH = "b4e80e0a450314e4ca9878aa8fca084dd4ecf2c2b5ba10c91edd243c7aad3cbd718765be7570a571389ba53b1b5e63c9b21b1686814bf00095ca06e2d3a5b2dc"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql12-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux-devel \
libxslt-devel \
openssl-devel \
pam-devel \
pkgconfig-krb5 \
postgresql-server-devel-noarch \
postgresql12-devel \
postgresql12-server \
readline-devel \
zlib-devel"

inherit rpm
