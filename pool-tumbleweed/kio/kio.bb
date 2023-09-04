SUMMARY = "Network transparent access to files and data"
DESCRIPTION = "This framework implements almost all the file management functions you \
will ever need. In fact, the KDE file manager (Dolphin) and the KDE \
file dialog also uses this to provide its network-enabled file management."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kio-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "80a5dbb7d8dbb56d656777dc97a2d96ce215a031aaebb18507752f7e9ac587ff22c67f4fb875f1646e22709dd61aa24090704a8a306a72c3a6cd34edf8e40ce1"

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
