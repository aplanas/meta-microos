SUMMARY = "SQLite3 output target for ulogd"
DESCRIPTION = "SQLite3 output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.8"

RPM_NAME = "ulogd-sqlite3-2.0.8-1.1.aarch64.rpm"
RPM_HASH = "775bc06088bc709b35046eabcd9df4d99766870efd485b80d3e3e3296abb129f32b12701f0b4c3a53762055a54afa4dac62b6e898dc556b7250b5f8ee770313d"

RPROVIDES:${PN} += "ulogd-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
ulogd"

inherit rpm
