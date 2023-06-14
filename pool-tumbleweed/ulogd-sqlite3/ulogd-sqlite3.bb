SUMMARY = "SQLite3 output target for ulogd"
DESCRIPTION = "SQLite3 output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.7"

RPM_NAME = "ulogd-sqlite3-2.0.7-6.8.aarch64.rpm"
RPM_HASH = "2f30f754446082c1c542a8344d9fde608c59bcb837e785a9e568927c8184d51664bf7dd2b919026a48d4a597a6e261304e7396f308f5da8cd3919c2eedeae434"

RPROVIDES:${PN} += "ulogd-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
ulogd"

inherit rpm
