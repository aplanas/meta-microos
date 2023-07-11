SUMMARY = "Well designed C++ sqlite 3.x wrapper library"
DESCRIPTION = "VSQLite++ is a C++ wrapper for sqlite3 using the C++ standard library and boost. \
VSQLite++ is designed to be easy to use and focuses on simplicity."
LICENSE = "BSD-3-Clause"

PV = "0.3.13"

RPM_NAME = "libvsqlitepp3-0.3.13-4.11.aarch64.rpm"
RPM_HASH = "19d5f7daeedeb460b559c5c84c573a51162ac58d94f9ce5aa2be0dbd45d7f4de9a2258c76528a9c13864a387a53df62b58816e11bf7063d17c3e43fd05cfdfe3"

RPROVIDES:${PN} += "libvsqlitepp.so.3 \
libvsqlitepp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
