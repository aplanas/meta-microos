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

PV = "12.16"

RPM_NAME = "postgresql12-server-12.16-1.1.aarch64.rpm"
RPM_HASH = "35d3303f29e2a43d9fd640594c3e8e0cc21c9ae3d061124b960b2de402d00072299de933823ee5dc31305edf6fe285a1901c75cc4254558a06dc9d1d03d4c359"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql12-server"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libicui18n.so.73 \
libicuuc.so.73 \
libldap.so.2 \
libm.so.6 \
libpam.so.0 \
libpq.so.5 \
libpq5 \
libssl.so.3 \
libsystemd.so.0 \
libxml2.so.2 \
postgresql \
postgresql-noarch \
postgresql-server-noarch \
timezone"

inherit rpm
