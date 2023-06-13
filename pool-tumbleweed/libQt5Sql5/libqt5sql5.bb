SUMMARY = "Qt 5 SQL related libraries"
DESCRIPTION = "Qt 5 libraries which are used for connection with an SQL server. You \
will need also a plugin package for a supported SQL server."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Sql5-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "d32bda2bd4390dfa80371de6f28357fec0853a3fcb5e77295add9b9ff8912d9759981423464d138aada0b60f34e194a0186de7282087f0d29f4cf9db676e1733"

RPROVIDES:${PN} += "libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql.so.5(Qt_5.0)(64bit) \
libQt5Sql.so.5(Qt_5.1)(64bit) \
libQt5Sql.so.5(Qt_5.10)(64bit) \
libQt5Sql.so.5(Qt_5.11)(64bit) \
libQt5Sql.so.5(Qt_5.12)(64bit) \
libQt5Sql.so.5(Qt_5.13)(64bit) \
libQt5Sql.so.5(Qt_5.14)(64bit) \
libQt5Sql.so.5(Qt_5.15)(64bit) \
libQt5Sql.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Sql.so.5(Qt_5.2)(64bit) \
libQt5Sql.so.5(Qt_5.3)(64bit) \
libQt5Sql.so.5(Qt_5.4)(64bit) \
libQt5Sql.so.5(Qt_5.5)(64bit) \
libQt5Sql.so.5(Qt_5.6)(64bit) \
libQt5Sql.so.5(Qt_5.7)(64bit) \
libQt5Sql.so.5(Qt_5.8)(64bit) \
libQt5Sql.so.5(Qt_5.9)(64bit) \
libQt5Sql5 \
libQt5Sql5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
