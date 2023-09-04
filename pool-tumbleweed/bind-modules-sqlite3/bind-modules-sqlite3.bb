SUMMARY = "A DLZ module which stores zone data in an sqlite3 db"
DESCRIPTION = "This package provides the externally loadable SQLitee DLZ module, without \
update support."
LICENSE = "MPL-2.0"

PV = "9.18.18"

RPM_NAME = "bind-modules-sqlite3-9.18.18-1.1.aarch64.rpm"
RPM_HASH = "a745039a65a7ef687aaecb65c1d77170f721c3ea475ca780ca8f65082512d426c22149c360c4095fdc223b2aba11504e370ec19a3ccf8569bc02c7aef9e00cf4"

RPROVIDES:${PN} += "bind-modules-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
