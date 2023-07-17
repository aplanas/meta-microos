SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kio-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "74dfd0650e1725cce82d5d9c1136a162e8f1a31765e2734ea1087e884ec32e4f60ed3c41069b554f8416a98f4650ea9c81a63cc3d70b3c943d57316bb44e45d1"

RPROVIDES:${PN} += "kio \
libKF5KIOFileWidgets.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
kded \
kio-core \
ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5ItemViews.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5Notifications.so.5 \
libKF5Service.so.5 \
libKF5Solid.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
