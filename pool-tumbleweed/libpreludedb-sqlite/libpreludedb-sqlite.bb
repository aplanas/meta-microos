SUMMARY = "Plugin to use prelude with a sqlite database"
DESCRIPTION = "This plugin allows prelude to store alerts into a sqlite database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-sqlite-5.2.0-2.12.aarch64.rpm"
RPM_HASH = "266a058fcccb565858b14f3f0f2c72a4390521ebadc1a9b3db21213b53b55c5c6b9d4f166fdc02efbe315a4c6c03624c0362b55f56317e859e6fb095a819a8d8"

RPROVIDES:${PN} += "libpreludedb-sqlite"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprelude.so.28 \
libpreludedb-plugins \
libpreludedb.so.7 \
libsqlite3.so.0 \
sqlite"

inherit rpm
