SUMMARY = "Qt 5 unixODBC plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The QODBC driver allows to connect to an ODBC driver manager and \
access the available data sources. Note that you also need to install \
and configure ODBC drivers for the ODBC driver manager that is \
installed on your system."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Sql5-unixODBC-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "304965ccc469eb3f25cf6b0fcf9c122c043a2289546d8d8e189c8cadc284f6ac2afe385f291cafffe656c43e3592764b6bc8b35778691602ff0b081cc8c2fc44"

RPROVIDES:${PN} += "libQt5Sql5-unixODBC \
libQt5Sql5-unixODBC(aarch-64) \
libqsqlodbc.so()(64bit) \
libqt5-sql-unixODBC \
libqt5_sql_backend"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Sql5 \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libodbc.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
