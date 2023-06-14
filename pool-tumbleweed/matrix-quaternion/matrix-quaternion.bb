SUMMARY = "QT Matrix client"
DESCRIPTION = "Quaternion is a desktop IM client for the Matrix protocol using QT."
LICENSE = "GPL-3.0-only"

PV = "0.0.95.1"

RPM_NAME = "matrix-quaternion-0.0.95.1-1.11.aarch64.rpm"
RPM_HASH = "ea182a4299340e0a2d48be82d114ec16e0aa8f1e1a55823604aaa53c264b30480e0e5477b130c43fa24ada861dbf3327cd20f29532ffc16f9bdb1822f1ba2178"

RPROVIDES:${PN} += "matrix-quaternion \
matrix-quaternion-git \
quaternion \
quaternion-git"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libQuotient.so.0.6 \
libc.so.6 \
libgcc-s.so.1 \
libqt5keychain.so.1 \
libstdc++.so.6 \
matrix-quaternion-lang"

inherit rpm
