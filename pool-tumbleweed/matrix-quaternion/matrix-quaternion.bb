SUMMARY = "QT Matrix client"
DESCRIPTION = "Quaternion is a desktop IM client for the Matrix protocol using QT."
LICENSE = "GPL-3.0-only"

PV = "0.0.95.1"

RPM_NAME = "matrix-quaternion-0.0.95.1-1.12.aarch64.rpm"
RPM_HASH = "c67ab4ad58b90d553df0f47c8024bf028dc7ab430420ab796fd3e7eefd1290f5acdc2a806ed42779b322601b83c22d94a611b1c10e5236404ffdcb9b267aafa9"

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
