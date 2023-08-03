SUMMARY = "A DLZ module which stores zone data in an sqlite3 db"
DESCRIPTION = "This package provides the externally loadable SQLitee DLZ module, without \
update support."
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-sqlite3-9.18.17-1.1.aarch64.rpm"
RPM_HASH = "ff101ed626aaa8a89b5f33d260c58c4670847f1686ff256ce641184618065eade1c92a01d786e6246a0ae3d3c0d8fb2ccddbe102708236a10f0d74c86bf977ff"

RPROVIDES:${PN} += "bind-modules-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
