SUMMARY = "Redland storage module for PostgresSQL"
DESCRIPTION = "This store provides storage using the PostgreSQL open source database \
including contexts."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "1.0.17"

RPM_NAME = "redland-storage-postgresql-1.0.17-2.20.aarch64.rpm"
RPM_HASH = "3143b5de6b267f5fdd29f7b5006bf234297deed1c351236d7b56379a32d8f7388cba4c6332da78e4a44ef054f741766807a0d87b2b3f40006f82854d4da82ff9"

RPROVIDES:${PN} += "librdf_storage_postgresql.so()(64bit) \
redland-storage-postgresql \
redland-storage-postgresql(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpq.so.5()(64bit) \
librdf.so.0()(64bit) \
redland"

inherit rpm
