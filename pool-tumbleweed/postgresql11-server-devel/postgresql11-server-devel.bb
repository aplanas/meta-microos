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

PV = "11.20"

RPM_NAME = "postgresql11-server-devel-11.20-1.5.aarch64.rpm"
RPM_HASH = "ab5ad4b7fc553e37d28d2817bdb0778bd9dd68ca6abfe2a25478e33015ce7f15d7d6814f39bee91d566432a4b2a22237db58c74c53ae43649e830cffca36ce21"

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
