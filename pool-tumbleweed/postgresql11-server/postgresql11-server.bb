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

PV = "11.21"

RPM_NAME = "postgresql11-server-11.21-1.1.aarch64.rpm"
RPM_HASH = "f3ba03c6072271220aafb170cbbe19c90616d3959a9736df2f01b3bdb2bd99e00cd9c9419c3c09199e7ef1fe805ea138b7fb28ad3bd793084e7cecf1d6ed4b4b"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql11-server"

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
