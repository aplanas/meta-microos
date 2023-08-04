SUMMARY = "A DLZ module which stores zone data in an sqlite3 db"
DESCRIPTION = "This package provides the externally loadable SQLitee DLZ module, without \
update support."
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-sqlite3-9.18.17-1.2.aarch64.rpm"
RPM_HASH = "9f298b0f0547f43562a34ba980dc272b87fd6c326a2bc52b88f7589f9677e48ebf895d34eedb7539fcd4b3026b289df93e5fc06f391d561db9b1a76433744943"

RPROVIDES:${PN} += "bind-modules-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
