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

PV = "12.15"

RPM_NAME = "postgresql12-server-12.15-1.2.aarch64.rpm"
RPM_HASH = "5d109355b670d4ce067a9489176812c2599b66c99065ce1c063d0b4c08f301140abd3b0fe66be6921716d115c793c62963591ccbfa68cefeb53d83fc03f3e8c6"

RPROVIDES:${PN} += "libpqwalreceiver.so()(64bit) \
postgresql-server-implementation \
postgresql12-server \
postgresql12-server(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
glibc-locale \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libldap.so.2()(64bit) \
libm.so.6()(64bit) \
libpam.so.0()(64bit) \
libpq.so.5()(64bit) \
libpq5 \
libssl.so.3()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libxml2.so.2()(64bit) \
postgresql \
postgresql-noarch \
postgresql-server-noarch \
timezone"

inherit rpm
