SUMMARY = "Automatic Mouse Click"
DESCRIPTION = "Clicks the mouse for you, reducing hand strain."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kmousetool-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "c6b546cbd6e14612d98f8964d804875c059858d0513de77b13a45b899c0daa8a12c0384f59396373441d793dc12e74b96b053e213f4642456ee99f5b2162243f"

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
