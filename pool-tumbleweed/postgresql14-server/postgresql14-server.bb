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

PV = "14.8"

RPM_NAME = "postgresql14-server-14.8-1.6.aarch64.rpm"
RPM_HASH = "4991d1a7813e1c77a7464cbf32f7be75b8ede624f2cd5fdc08e6f61bbe781f8e1ef24ce863e561b4828aa784c5ebdea6d3a031c3ad155e1ad70daacb36261d8b"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql14-server"

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
postgresql \
postgresql-noarch \
postgresql-server-noarch \
timezone"

inherit rpm
