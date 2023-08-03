SUMMARY = "Qt 6 unixODBC plugin"
DESCRIPTION = "A plugin to connect to an ODBC driver manager in Qt applications and \
access the available data sources. Note that you also need to install \
and configure ODBC drivers for the ODBC driver manager that is \
installed on your system."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-sql-unixODBC-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "6a37186d8e49de35d37a20b1dc61de99db2c6cf3ec7f319aff4fb7c38ba8fd587ef2e81ec711afb63062583300f03272ed205c8edabb60abee71789284b33954"

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
