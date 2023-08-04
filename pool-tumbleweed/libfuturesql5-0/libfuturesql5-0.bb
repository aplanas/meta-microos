SUMMARY = "Library for accessing SQLite"
DESCRIPTION = "A library for accessing SQLite (and other databases) in Qt projects without \
blocking. \
 \
It also features a migration system and automatic result deserialization."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfuturesql5-0-0.1.1-1.1.aarch64.rpm"
RPM_HASH = "1c4f61be01fcd864445d4a2804f1bc8fcfc1fb190022783047bcdd72b3d9c7d8f46dbfa9d7e94003c0a1cc8c71ae5d17df29460b3553da74615860f6507d8cf7"

RPROVIDES:${PN} += "libfuturesql5-0 \
libfuturesql5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Sql.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
