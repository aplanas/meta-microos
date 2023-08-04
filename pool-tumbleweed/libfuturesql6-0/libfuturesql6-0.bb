SUMMARY = "Library for accessing SQLite"
DESCRIPTION = "A library for accessing SQLite (and other databases) in Qt projects without \
blocking. \
 \
It also features a migration system and automatic result deserialization."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.1"

RPM_NAME = "libfuturesql6-0-0.1.1-1.1.aarch64.rpm"
RPM_HASH = "1fb372d17b14000fa4b6b198cfe59f258a0ebdd5d56ccadaa597ab9ed8ebef98b4bd201c358568166db823a4fd94b68a8b9a3f79ef144566423c1fed69a10e46"

RPROVIDES:${PN} += "libfuturesql6-0 \
libfuturesql6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
