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

PV = "12.15"

RPM_NAME = "postgresql12-server-devel-12.15-1.5.aarch64.rpm"
RPM_HASH = "f969267dc1834410fcb149f90a98f34636733e5f1cdfaa00a8c66bdb16d9fa57cabf4cd3a1ff186deb725b20b2f2b50cce9fe741a00e815aed491940d0028e56"

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
