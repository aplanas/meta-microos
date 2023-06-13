SUMMARY = "SQLite plugin for tntdb"
DESCRIPTION = "SQLite plugin for tntdb abstraction library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "tntdb-sqlite-1.4-1.12.aarch64.rpm"
RPM_HASH = "4b8da10d971565e69a5ee682dcc257a12956a1fe274be8bd6a98ebe952575e18b418ed7252d85f02dc48eb27ae948f19f1d527a3360507439d5140a105924213"

RPROVIDES:${PN} += "tntdb-sqlite \
tntdb-sqlite(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libcxxtools.so.10()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.7)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtntdb.so.5()(64bit)"

inherit rpm
