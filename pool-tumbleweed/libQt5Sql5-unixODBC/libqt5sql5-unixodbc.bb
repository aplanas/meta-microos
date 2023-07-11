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

RPM_NAME = "libQt5Sql5-unixODBC-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "666bd07a834c67ef2b7a9445a3f29fe83fd347f956e93a352b991a471616ab356a1695d29004ec2f7b6034220bb488f634d71d6a7011d34a7edcb014c1e3a26f"

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
