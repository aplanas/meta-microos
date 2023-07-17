SUMMARY = "Database plugin for Orthanc"
DESCRIPTION = "MySQL/mariadb Database plugin for Orthanc, replaces SQLite database"
LICENSE = "AGPL-3.0-or-later"

PV = "5.1"

RPM_NAME = "orthanc-mysql-5.1-1.1.aarch64.rpm"
RPM_HASH = "b097f4a31f96959d4cfcd0e67f269013b0325ffa47bb3fcd75d7d13fcd5fd40b578e093aba53f3d5941e72a73ac498f98ba5a3b16a8e5edd1acc7fb411715462"

RPROVIDES:${PN} += "libOrthancMySQLIndex.so.5.1 \
libOrthancMySQLStorage.so.5.1 \
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
libprotobuf.so.23.4.0 \
libstdc++.so.6 \
mariadb \
orthanc"

inherit rpm
