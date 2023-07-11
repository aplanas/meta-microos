SUMMARY = "Database plugin for Orthanc"
DESCRIPTION = "MySQL/mariadb Database plugin for Orthanc, replaces SQLite database"
LICENSE = "AGPL-3.0-or-later"

PV = "4.3"

RPM_NAME = "orthanc-mysql-4.3-1.16.aarch64.rpm"
RPM_HASH = "f62cf54b73c023a38b80e3818ece4a3d2134e5fc3cc67a3d29e530f8f3c585c654330b90970912611b038d3cbbc181ab0ebfab50b1b8c852eea3c12bec119b90"

RPROVIDES:${PN} += "libOrthancMySQLIndex.so.4.3 \
libOrthancMySQLStorage.so.4.3 \
orthanc-mysql"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.82.0 \
libboost-iostreams.so.1.82.0 \
libboost-locale.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjsoncpp.so.25 \
libmariadb.so.3 \
libstdc++.so.6 \
mariadb \
orthanc"

inherit rpm
