SUMMARY = "Qt5 networkauth examples"
DESCRIPTION = "Examples for libqt5-qtnetworkauth module."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde0"

RPM_NAME = "libqt5-qtnetworkauth-examples-5.15.10+kde0-1.1.aarch64.rpm"
RPM_HASH = "806f371e1733b78fadf66b7ad0c8cfd3e7384a2d546fa42a64ffeb711d761146396a90b4526ca89c2fe259846eba0a9e7b0b21e0ee6994e98bb4de2dab1076a7"

RPROVIDES:${PN} += "libqt5-qtnetworkauth-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
