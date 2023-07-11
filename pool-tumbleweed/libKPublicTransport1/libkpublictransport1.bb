SUMMARY = "Library for querying public transport data"
DESCRIPTION = "A library for access realtime public transport data and for performing public \
ransport journey queries."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libKPublicTransport1-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "664ce434cc5f4ea2e8febc4167fd49a89585b1239d797c3deaaeee5e0405d16c26e16b2117a89229ff7ef41c6f6b038303e3263ccc9e0d22c164e7bf73703439"

RPROVIDES:${PN} += "libKPublicTransport.so.1 \
libKPublicTransport1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
