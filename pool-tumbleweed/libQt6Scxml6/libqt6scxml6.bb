SUMMARY = "Qt 6 Scxml library"
DESCRIPTION = "The Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Scxml6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "c58490f72dce3837a30f42e59da55e7f12bd7de35458cd9df245b97e06d03dbae1f2d64fccaa43d9e8a63b37f14060462f483babf9ccb11b6d3b2d16c61e2aad"

RPROVIDES:${PN} += "libQt6Scxml.so.6 \
libQt6Scxml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
