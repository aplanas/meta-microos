SUMMARY = "Qt 6 unixODBC plugin"
DESCRIPTION = "A plugin to connect to an ODBC driver manager in Qt applications and \
access the available data sources. Note that you also need to install \
and configure ODBC drivers for the ODBC driver manager that is \
installed on your system."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-unixODBC-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "21d1e1eab61a703e9816f0dbd65857ae0ae6dc60b76c7c9c976ed1a5d2fc88e130186c818e0eed3dd37a498d06e80c0d78e40fef3b62a350c77e15f08f676915"

RPROVIDES:${PN} += "libqsqlodbc.so \
qt6-sql-unixODBC"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libQt6Sql6 \
libc.so.6 \
libm.so.6 \
libodbc.so.2 \
libstdc++.so.6"

inherit rpm
