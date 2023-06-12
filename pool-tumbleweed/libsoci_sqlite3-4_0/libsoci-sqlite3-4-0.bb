SUMMARY = "SQLite back-end for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
This package contains the back-end for SQLite."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "libsoci_sqlite3-4_0-4.0.2-4.4.aarch64.rpm"
RPM_HASH = "9b6ed97febba4b8275ecdbd78a07a27570bd7202cf8ec213787950a7e55142792ee78ad0d61fdbdb682bb95a310838b7ea32481d7080a72c3d4e4ee42628706d"

RPROVIDES:${PN} += "libsoci4_0-backend \
libsoci_sqlite3-4_0 \
libsoci_sqlite3-4_0(aarch-64) \
libsoci_sqlite3.so.4.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsoci_core.so.4.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
