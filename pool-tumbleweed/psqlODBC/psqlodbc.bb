SUMMARY = "ODBC Driver for PostgreSQL"
DESCRIPTION = "This package contains the ODBC (Open DataBase Connectivity) driver and \
sample configuration files needed for applications to access a \
PostgreSQL database using ODBC."
LICENSE = "LGPL-2.1-or-later"

PV = "13.01.0000"

RPM_NAME = "psqlODBC-13.01.0000-1.11.aarch64.rpm"
RPM_HASH = "80d00929416ca196f2b7fcd59d10919455722945e481954155892ba4789562fc4313ea5d89e7a3cc9d8d1fca616ac0520dac62241f9285e8a9627f36d00d39f7"

RPROVIDES:${PN} += "pg-iface-/usr/lib/pgsql/odbcinst.ini \
pg-odbc \
postgresql-odbc \
psqlODBC"

RDEPENDS:${PN} += "/usr/bin/odbcinst \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libodbcinst.so.2 \
libpq.so.5"

inherit rpm
