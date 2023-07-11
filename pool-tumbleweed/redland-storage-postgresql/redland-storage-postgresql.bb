SUMMARY = "Redland storage module for PostgresSQL"
DESCRIPTION = "This store provides storage using the PostgreSQL open source database \
including contexts."
LICENSE = "LGPL-2.1-or-later & Apache-2.0"

PV = "1.0.17"

RPM_NAME = "redland-storage-postgresql-1.0.17-2.21.aarch64.rpm"
RPM_HASH = "72d6d1bb2135a17bb8ae0f3d42405f0dde1ce8ab031291879a9c20ebcaaffc7b13aaf8b41a2810158d69c4388b253b75432fc3cf415017b038de68c98478e1b8"

RPROVIDES:${PN} += "librdf-storage-postgresql.so \
redland-storage-postgresql"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
librdf.so.0 \
redland"

inherit rpm
