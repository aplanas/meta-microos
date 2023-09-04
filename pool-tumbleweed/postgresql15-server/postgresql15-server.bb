SUMMARY = "The Programs Needed to Create and Run a PostgreSQL Server"
DESCRIPTION = "PostgreSQL is an advanced object-relational database management system \
that supports an extended subset of the SQL standard, including \
transactions, foreign keys, sub-queries, triggers, and user-defined \
types and functions. \
 \
This package includes the programs needed to create and run a \
PostgreSQL server, which will in turn allow you to create and maintain \
PostgreSQL databases."
LICENSE = "PostgreSQL"

PV = "15.4"

RPM_NAME = "postgresql15-server-15.4-1.1.aarch64.rpm"
RPM_HASH = "e82d9e828f45eda964a7849743741eed93eed657a47880238c9312fe9b69446c22f2ac8a5487f56146c1a0fc5956e7fda46579fe3d7074cc680d53d0cdf1a6bd"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql15-server"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libicui18n.so.73 \
libicuuc.so.73 \
libldap.so.2 \
liblz4.so.1 \
libm.so.6 \
libpam.so.0 \
libpq.so.5 \
libpq5 \
libssl.so.3 \
libsystemd.so.0 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1 \
postgresql \
postgresql-noarch \
postgresql-server-noarch \
timezone"

inherit rpm
