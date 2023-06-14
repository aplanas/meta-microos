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

RPM_NAME = "postgresql13-server-devel-13.11-1.2.aarch64.rpm"
RPM_HASH = "a9556e49a1b6db05e09b3a6f89e0e1894ff40fe8be4eabc30e15f3496d6fcaec5dac4022ac2574a0e9714632ec638e51b9522b1467ad72f825bdbef917ef2d2f"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql13-server-devel"

RDEPENDS:${PN} += "/bin/sh \
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
