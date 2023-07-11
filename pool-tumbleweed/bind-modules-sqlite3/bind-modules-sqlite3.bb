SUMMARY = "A DLZ module which stores zone data in an sqlite3 db"
DESCRIPTION = "This package provides the externally loadable SQLitee DLZ module, without \
update support."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-sqlite3-9.18.16-2.1.aarch64.rpm"
RPM_HASH = "aa5cee327f9a71e5d648834e6e0ed03992a32dcd154124a27f564e36b2349e460c2eb4e365f76351430f870ef2af6912dfb1b8dd6890cd7a4e858ef09981e782"

RPROVIDES:${PN} += "bind-modules-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
