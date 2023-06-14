SUMMARY = "Modern web browser"
DESCRIPTION = "Falkon is a web browser designed to well integrate with all \
common Linux desktops like GNOME and KDE Plasma. \
It supports current web standards and comes with many features, \
such as an integrated ad blocker. \
 \
It was previously known as QupZilla."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "falkon-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "693bc126950aa95724c813225d6e9e71e9df237b0e95b2a270a3abef0da2ca77de006ac413371a196a83623475bff85474750c090d34759f5517082c7a413e19"

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
