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

PV = "2.47"

RPM_NAME = "pgbackrest-2.47-1.1.aarch64.rpm"
RPM_HASH = "02fe81f376078bab5e0d131323d510b0dc9be0f32214308586d1ca7cff25b3cb75e525e7d3830f47ba2647b2677279290ce60b10bc072877597f3780fa23c69d"

RPROVIDES:${PN} += "config-pgbackrest \
pgbackrest"

RDEPENDS:${PN} += "/usr/bin/sh \
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
