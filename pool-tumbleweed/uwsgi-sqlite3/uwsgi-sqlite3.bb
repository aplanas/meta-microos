SUMMARY = "SQLite3 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for storing application configuration in SQLite3 \
databases."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-sqlite3-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "d7b56847923211a2ffca4cc41b40c354016dd5c3d7fa9c6e76f6f625e91b515f43c6c75c145617cf81e41c3c30ac777ba267857ece1fce47828733754891ec73"

RPROVIDES:${PN} += "uwsgi-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
uwsgi"

inherit rpm
