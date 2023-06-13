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

RPM_NAME = "postgresql12-server-devel-12.15-1.2.aarch64.rpm"
RPM_HASH = "1c59b3ded1ac980fea925a021a3a905d62265a60cd2bcf2f1f6b0b42a7057ca6cd8f9eebcee7a19c066a71ae5ae8b1184d6e8b1456d894a49ad042cf7c1aeb50"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql12-server-devel \
postgresql12-server-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libselinux-devel \
libxslt-devel \
openssl-devel \
pam-devel \
pkgconfig(krb5) \
postgresql-server-devel-noarch \
postgresql12-devel \
postgresql12-server \
readline-devel \
zlib-devel"

inherit rpm
