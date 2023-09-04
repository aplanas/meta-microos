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

PV = "13.12"

RPM_NAME = "postgresql13-server-13.12-1.1.aarch64.rpm"
RPM_HASH = "7b0cc7835588a88882e38d2f8bb4208732ca466c1537b36c346be2e4906bd61a5001971f3cd6dcdc2bbd210ee88a4f9b54cc8cd06e5ac5d6169e18c668b9cf6f"

RPROVIDES:${PN} += "libpqwalreceiver.so \
postgresql-server-implementation \
postgresql13-server"

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
