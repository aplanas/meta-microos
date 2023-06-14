SUMMARY = "Database connectivity and creation framework - MySQL driver"
DESCRIPTION = "This package contains the MySQL driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-mysql-driver-3.2.0-7.17.aarch64.rpm"
RPM_HASH = "e8af733defc9f02f3a3e1f09c815e9fca3bd0b2ab36bfee65e839f0de4bf71c393fa92bdb0a2006fea6dced8159bbc179eea5d1b529104eeddb5d9f9fb99a574"

RPROVIDES:${PN} += "calligra-kexi-mysql-driver \
kdb-mysql-driver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDb3.so.4 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libmariadb.so.3 \
libstdc++.so.6"

inherit rpm
