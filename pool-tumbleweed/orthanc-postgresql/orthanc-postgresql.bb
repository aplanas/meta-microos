SUMMARY = "Database plugin for Orthanc"
DESCRIPTION = "PostgreSQL Database plugin for Orthanc, replaces SQLite database"
LICENSE = "AGPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "orthanc-postgresql-4.0-1.16.aarch64.rpm"
RPM_HASH = "a09eada562851611dc38438371b2964bf91f9ca8b5eb774625ac9131c8f9e9eb184e3ce071625d9b6ad268d5fb3b9a7a8e62701578fafbe17684baae9a1c0227"

RPROVIDES:${PN} += "libOrthancPostgreSQLIndex.so.4.0()(64bit) \
libOrthancPostgreSQLStorage.so.4.0()(64bit) \
orthanc-postgresql \
orthanc-postgresql(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_iostreams.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjsoncpp.so.25()(64bit) \
libpq.so.5()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit) \
libz.so.1()(64bit) \
orthanc \
postgresql-server"

inherit rpm
