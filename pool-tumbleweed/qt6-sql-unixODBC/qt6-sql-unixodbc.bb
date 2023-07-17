SUMMARY = "Qt 6 unixODBC plugin"
DESCRIPTION = "A plugin to connect to an ODBC driver manager in Qt applications and \
access the available data sources. Note that you also need to install \
and configure ODBC drivers for the ODBC driver manager that is \
installed on your system."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-sql-unixODBC-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "29aa5940ad946cd3094de58e815d933cd944544a8cb4877e38a090fa22eb781534e038e48568704d3d622ee8a87ac329dd0fa875a0be59bb5a7e005f336ef2cc"

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
