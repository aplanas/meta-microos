SUMMARY = "SQLite3 Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for storing application configuration in SQLite3 \
databases."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-sqlite3-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "88c15b8d94b2d7b1f5d0af23ba0af9dca4ca24073803b0075a9d9fa2b512c84d0f5de34636779927ca7abdf970757e1873715b951b95533fade4a6a3b16f2b40"

RPROVIDES:${PN} += "uwsgi-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
uwsgi"

inherit rpm
