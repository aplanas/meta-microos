SUMMARY = "Database plugin for Orthanc"
DESCRIPTION = "MySQL/mariadb Database plugin for Orthanc, replaces SQLite database"
LICENSE = "AGPL-3.0-or-later"

PV = "4.3"

RPM_NAME = "orthanc-mysql-4.3-1.15.aarch64.rpm"
RPM_HASH = "3aa67915b185c887a9f66ca12c32239d05d659258a2e21b5d99d79545311f9547493148a11a6319e88905acedac190ec3442e9fd039c2c124cea6e61efe9971e"

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
