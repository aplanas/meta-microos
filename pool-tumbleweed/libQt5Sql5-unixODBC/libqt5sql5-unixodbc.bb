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
libqsqlodbc.so \
libqt5-sql-backend \
libqt5-sql-unixODBC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libQt5Sql5 \
libc.so.6 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6"

inherit rpm
