SUMMARY = "Qt 6 unixODBC plugin"
DESCRIPTION = "A plugin to connect to an ODBC driver manager in Qt applications and \
access the available data sources. Note that you also need to install \
and configure ODBC drivers for the ODBC driver manager that is \
installed on your system."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-unixODBC-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "dee99e08498aa9cb0ccd87bb4801aa620cb6fd51b04c13743e89b58d644d928defd5c9956c48f1140534763909aa61556dfe18d1b3825933a098b0c7e7a84159"

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
