SUMMARY = "Modern web browser"
DESCRIPTION = "Falkon is a web browser designed to well integrate with all \
common Linux desktops like GNOME and KDE Plasma. \
It supports current web standards and comes with many features, \
such as an integrated ad blocker. \
 \
It was previously known as QupZilla."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "falkon-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "a01658a2c22a918780d8c704784b8089ccbf7e3a4023d25b1c3d1897016171518807f69973f91c795a75c46a153ba4b22801fcace5f5dbad201875908373df52"

RPROVIDES:${PN} += "falkon \
falkon-gnome-keyring \
libFalkonPrivate.so.3 \
qupzilla \
web-browser"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5WebChannel.so.5 \
libQt5WebEngineCore.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
