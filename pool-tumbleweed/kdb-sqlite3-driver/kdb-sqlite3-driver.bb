SUMMARY = "Database connectivity and creation framework - SQLite3 driver"
DESCRIPTION = "This package contains the SQLite3 driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-sqlite3-driver-3.2.0-7.17.aarch64.rpm"
RPM_HASH = "0602406c44560cf71c660b7e809137b6fee312c01dddd8540420236b56cc34e79ed9ba8e0a9ec672c1a87699a4b2daf5a620fb4d611d8da72818ac755c602fb2"

RPROVIDES:${PN} += "calligra-kexi-sqlite3-driver \
kdb-sqlite3-driver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDb3.so.4 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libicui18n.so.73 \
libicuuc.so.73 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
