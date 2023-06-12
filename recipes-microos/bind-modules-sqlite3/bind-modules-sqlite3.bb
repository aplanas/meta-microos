SUMMARY = "A DLZ module which stores zone data in an sqlite3 db"
DESCRIPTION = "This package provides the externally loadable SQLitee DLZ module, without \
update support."
LICENSE = "MPL-2.0"

PV = "9.18.15"

RPM_NAME = "bind-modules-sqlite3-9.18.15-1.1.aarch64.rpm"
RPM_HASH = "0a38ceeff9a9568fbacd8765fc96534bfae77320cc7cd677d343362fa172d07b08019b0388239b7d3fe5002edfc048a9c0429af7a8c8ce96739e195a2ae5123c"

RPROVIDES:${PN} += "bind-modules-sqlite3 bind-modules-sqlite3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
