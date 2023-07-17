SUMMARY = "Database plugin for Orthanc"
DESCRIPTION = "PostgreSQL Database plugin for Orthanc, replaces SQLite database"
LICENSE = "AGPL-3.0-or-later"

PV = "5.1"

RPM_NAME = "orthanc-postgresql-5.1-1.1.aarch64.rpm"
RPM_HASH = "c0ef4c17adff4186a6a32d8d04fa19ad6f3810651aad58260dd29de29d24cbc1f50a2bfc3c4f86f46bbd42da02acf85dc2a53bc08aa47e68ababd9968bd1f339"

RPROVIDES:${PN} += "libOrthancPostgreSQLIndex.so.5.1 \
libOrthancPostgreSQLStorage.so.5.1 \
orthanc-postgresql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libpq.so.5 \
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
libuuid.so.1 \
orthanc \
postgresql-server"

inherit rpm
