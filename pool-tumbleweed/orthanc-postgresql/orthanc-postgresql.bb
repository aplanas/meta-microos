SUMMARY = "Database plugin for Orthanc"
DESCRIPTION = "PostgreSQL Database plugin for Orthanc, replaces SQLite database"
LICENSE = "AGPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "orthanc-postgresql-4.0-1.17.aarch64.rpm"
RPM_HASH = "1b57c1a016612fa9b89b2bfce2fd5b1561354ef9d55bda21264e795df5c48c2da2691fabada0fae251caaef4bf61a46c9d5357108beaca43ff7eef91d9c74109"

RPROVIDES:${PN} += "libOrthancPostgreSQLIndex.so.4.0 \
libOrthancPostgreSQLStorage.so.4.0 \
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
libstdc++.so.6 \
libuuid.so.1 \
libz.so.1 \
orthanc \
postgresql-server"

inherit rpm
