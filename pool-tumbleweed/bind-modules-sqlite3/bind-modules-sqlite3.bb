SUMMARY = "A DLZ module which stores zone data in an sqlite3 db"
DESCRIPTION = "This package provides the externally loadable SQLitee DLZ module, without \
update support."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-modules-sqlite3-9.18.16-3.1.aarch64.rpm"
RPM_HASH = "9ee6e03694a6e72575b4f0a5d001e9c77668ff21c9a646a85cd75c5a679d9abeff1f71b056d7c25450c5721a7b830e4ed35a3a816db5be0af590448d6b70497c"

RPROVIDES:${PN} += "bind-modules-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
