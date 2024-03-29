SUMMARY = "Qt 5 unixODBC plugin"
DESCRIPTION = "The Qt SQL module uses driver plugins to communicate with the \
different database APIs. \
 \
The QODBC driver allows to connect to an ODBC driver manager and \
access the available data sources. Note that you also need to install \
and configure ODBC drivers for the ODBC driver manager that is \
installed on your system."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5Sql5-unixODBC-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "617126540fde08d1f6da651fa5b62eb4b56cace3bbaa40802f7a92cea189e2ee3c1d27f388b5c74409ce8fcb5b50e9b5d6db2d687dd3333b1c3eeec3c343c960"

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
