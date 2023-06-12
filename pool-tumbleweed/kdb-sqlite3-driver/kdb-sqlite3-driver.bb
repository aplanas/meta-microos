SUMMARY = "Database connectivity and creation framework - SQLite3 driver"
DESCRIPTION = "This package contains the SQLite3 driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-sqlite3-driver-3.2.0-7.17.aarch64.rpm"
RPM_HASH = "0602406c44560cf71c660b7e809137b6fee312c01dddd8540420236b56cc34e79ed9ba8e0a9ec672c1a87699a4b2daf5a620fb4d611d8da72818ac755c602fb2"

RPROVIDES:${PN} += "calligra-kexi-sqlite3-driver \
kdb-sqlite3-driver \
kdb-sqlite3-driver(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKDb3.so.4()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit)"

inherit rpm