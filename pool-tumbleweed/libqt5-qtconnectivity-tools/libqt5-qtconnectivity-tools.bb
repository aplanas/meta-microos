SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.10+kde4"

RPM_NAME = "libqt5-qtconnectivity-tools-5.15.10+kde4-1.1.aarch64.rpm"
RPM_HASH = "e2540db2d3639134c1f7f6c1fbbb8c8f0a7f90eb732b74c30d71af97b23984c0402ccbe8094062bfe4eb2bf50fca61ce3a6a5afb6d473a18ece9302dc3c26a20"

RPROVIDES:${PN} += "libqt5-qtconnectivity-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libbluetooth.so.3 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
