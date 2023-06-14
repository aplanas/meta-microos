SUMMARY = "Reliable PostgreSQL Backup & Restore"
DESCRIPTION = "pgBackRest aims to be a simple, reliable backup and restore system for \
PostgreSQL that can seamlessly scale up to the largest databases and \
workloads. \
 \
The following features are available: \
- Parallel backup & restore \
- Local or remote operation \
- Full, incremental, differential backups \
- Backup rotation & archive expiration \
- Backup integrity \
- Page checksums \
- Backup resume \
- Streaming compression & checksums \
- Delta restore \
- Parallel, asynchronous WAL push & get \
- Tablespace & link support \
- Amazon S3 support \
- Encryption \
- Compatibility with PostgreSQL >= 8.3"
LICENSE = "MIT"

PV = "2.46"

RPM_NAME = "pgbackrest-2.46-1.1.aarch64.rpm"
RPM_HASH = "28962ffff3878ece99dbcd88a769daefdd200afb94210810b62fec25b80c997969a5567d040c1cc5027e41d19bcc34a8d2cd7c7da1a39b941a8b826001f109b8"

RPROVIDES:${PN} += "config-pgbackrest \
pgbackrest"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
libpq.so.5 \
libssl.so.3 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1 \
postgresql-server"

inherit rpm
