SUMMARY = "Sqlite3 DBI module for Qore"
DESCRIPTION = "Sqlite3 DBI driver module for the Qore Programming Language."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "qore-sqlite3-module-1.0.2-2.2.aarch64.rpm"
RPM_HASH = "d9097f16491b8726c6d48622e07df28f1059eb9c4f826721232e387be27f4b92bd4930db4892b6a7085594437b0e79689c3f4b2340e705f6f8fc8dfc1fc9c84d"

RPROVIDES:${PN} += "qore-sqlite3-module"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
