SUMMARY = "Qt 6 Qml library"
DESCRIPTION = "The Qt 6 Qml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6Qml6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8514bee4e279bce6a773d4ec087619e684b380b4665aa25838041206abab6ceef76c3b0e59d811358e812ee65187bd0ffb417e7ae1b6a8aa042e74361492e049"

RPROVIDES:${PN} += "libQt6Qml.so.6 \
libQt6Qml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
