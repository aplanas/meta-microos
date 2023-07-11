SUMMARY = "Automatic Mouse Click"
DESCRIPTION = "Clicks the mouse for you, reducing hand strain."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kmousetool-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f1b0a61cb1e726e8b7c1100e6ce73a5b395f9e54c9825b2229183b1d914980dd22f402c2aa925b4134096f25512d2b4273a9ce43f7599bcdf758c35c7153114b"

RPROVIDES:${PN} += "kmousetool \
kmousetool5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5Notifications.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
