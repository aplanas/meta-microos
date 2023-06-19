SUMMARY = "SQLite3 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for storing application configuration in SQLite3 \
databases."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-sqlite3-2.0.21-2.1.aarch64.rpm"
RPM_HASH = "020107eece2eb349a0b83bfe7335b40f9bf64604207714784ae15d6f3e64a7152e16014fc8eb1c60b4023d752803ef112bec3fe0521a8490f6399990546f4bde"

RPROVIDES:${PN} += "uwsgi-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
uwsgi"

inherit rpm
