SUMMARY = "KDE Terminal"
DESCRIPTION = "Konsole is a terminal emulator for the K Desktop Environment. \
This package provides KPart of the Konsole application."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konsole-part-23.04.1-1.2.aarch64.rpm"
RPM_HASH = "15451a2b44d109e266c7520fe741e7b25deac66e2ae2f26fa7a69487a428ce3ce8270945aff00dd4cd6bf2c15197904ab4ad6e34d42a207eec8dfcab366ca646"

RPROVIDES:${PN} += "konsole-part \
libkonsoleprivate.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Bookmarks.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5JobWidgets.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOGui.so.5 \
libKF5KIOWidgets.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5Notifications.so.5 \
libKF5Parts.so.5 \
libKF5Pty.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5WindowSystem.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
