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

RPM_NAME = "postgresql14-server-devel-14.8-1.2.aarch64.rpm"
RPM_HASH = "42b6baf72467a5ab34b1880ea6231f298a5f234455daf03e3541ddc28c319662798dfc855f55957feaa52732dbed327635dadcc215dabc5547c9a10dad0ea2f4"

RPROVIDES:${PN} += "postgresql-server-devel \
postgresql-server-devel-exclusive \
postgresql-server-devel-implementation \
postgresql14-server-devel \
postgresql14-server-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpq.so.5()(64bit) \
libselinux-devel \
libxslt-devel \
openssl-devel \
pam-devel \
pkgconfig(krb5) \
postgresql-server-devel-noarch \
postgresql14-devel \
postgresql14-server \
readline-devel \
zlib-devel"

inherit rpm
