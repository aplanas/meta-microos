SUMMARY = "ODBC Driver for PostgreSQL"
DESCRIPTION = "This package contains the ODBC (Open DataBase Connectivity) driver and \
sample configuration files needed for applications to access a \
PostgreSQL database using ODBC."
LICENSE = "LGPL-2.1-or-later"

PV = "13.01.0000"

RPM_NAME = "psqlODBC-13.01.0000-1.10.aarch64.rpm"
RPM_HASH = "18caec3a4f755f319b5f3dc4bbd597cd41ff3e122478d70cc2d42fb98574ebfab21a519845df42666a0a732078172f950bdb3d4f3bbffa351efce66a98ae31a5"

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
