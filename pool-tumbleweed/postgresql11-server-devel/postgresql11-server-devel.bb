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

RPM_NAME = "postgresql11-server-devel-11.20-1.2.aarch64.rpm"
RPM_HASH = "7e06b562f96c4ced07c68cf33ad8aa55fe54296289e4fd7d63e49f11371d59aee1914a8254fe69d3041d4786026579035f509384de77c579f3cdd0e2d135fd11"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql11-server-devel \
postgresql11-server-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libselinux-devel \
libxslt-devel \
openssl-devel \
pam-devel \
pkgconfig(krb5) \
postgresql-server-devel-noarch \
postgresql11-devel \
postgresql11-server \
readline-devel \
zlib-devel"

inherit rpm
