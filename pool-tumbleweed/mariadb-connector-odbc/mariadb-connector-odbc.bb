SUMMARY = "MariaDB ODBC Connector"
DESCRIPTION = "This package contains the MariaDB ODBC Connector to be used with unixODBC."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.10"

RPM_NAME = "mariadb-connector-odbc-3.1.10-1.12.aarch64.rpm"
RPM_HASH = "853a16d385c0bdeeb37cccc2d6fdeffaf7e552cfff887d20f33c8a989d97a3d58c72dfbf7c068043c148ae6de8685d4347614623efdb887fa2b7c57e2f21349d"

RPROVIDES:${PN} += "libmaodbc.so \
mariadb-connector-odbc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmariadb.so.3 \
libodbcinst.so.2"

inherit rpm
