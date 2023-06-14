SUMMARY = "Qt 6 RemoteObjects Tools"
DESCRIPTION = "This package contains REPC, a compiler for Qt RemoteObjects API definition files."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-tools-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9122724c0e3f672f453cf2df2970b94261597ad3021dea3996ceb40fc23ad199eb19b1983f5c33313d30398e790176aa93acd28e226eaaf3178017faf09dde6b"

RPROVIDES:${PN} += "qt6-remoteobjects-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
