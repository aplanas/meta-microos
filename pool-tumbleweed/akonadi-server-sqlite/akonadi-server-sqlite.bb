SUMMARY = "akonadi server's SQlite plugin"
DESCRIPTION = "Akonadi server's SQlite plugin."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-server-sqlite-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f0e6c7ad3515eb149d781111e1df73acfa2e8ec2ceae5e85ec20fccf96f3f9c3f820a37bf40c714096045ceb382e0fcd17e81c93a8b48f58efb26a9a3d514ea5"

RPROVIDES:${PN} += "akonadi-server-sqlite \
akonadi-server-sqlite(aarch-64) \
libqsqlite3.so()(64bit)"

RDEPENDS:${PN} += "akonadi-server \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
