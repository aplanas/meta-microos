SUMMARY = "PostgreSQL server development header files and utilities"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, subqueries, triggers, and user-defined \
types and functions. \
 \
This package contains the header files and libraries needed to compile \
C extensions that link into the PostgreSQL server. For building client \
applications, see the postgresql11-devel package."
LICENSE = "PostgreSQL"

PV = "11.21"

RPM_NAME = "postgresql11-server-devel-11.21-1.1.aarch64.rpm"
RPM_HASH = "2ebdfee396948bb34757ea99a36fcf3f1353f99b338701ef70d80affe350d677636b4406c32bfc0201efba667dc6896cf169291393ea1bae5473ba0635f000f2"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql11-server-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libselinux-devel \
libxslt-devel \
openssl-devel \
pam-devel \
pkgconfig-krb5 \
postgresql-server-devel-noarch \
postgresql11-devel \
postgresql11-server \
readline-devel \
zlib-devel"

inherit rpm
