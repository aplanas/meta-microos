SUMMARY = "KDE client for the Quassel IRC client"
DESCRIPTION = "Quassel IRC is a distributed IRC client, meaning that one (or \
multiple) client(s) can attach to and detach from a central core -- \
much like the combination of GNU Screen and a text-based IRC client \
such as WeeChat, but graphical. \
 \
This is the quassel KDE client only."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "quassel-client-0.14.0-1.5.aarch64.rpm"
RPM_HASH = "20b340961591b249121dafa7e77e2363e6a4066bd609c83895c1e4e504a9ed780a47170e04fc0e4a6965e455b155ca757ee32aa6cb635e0f017c69b367c49989"

RPROVIDES:${PN} += "quassel-client \
quassel-ui"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5SonnetUi.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdbusmenu-qt5.so.2 \
libgcc-s.so.1 \
libsnore-qt5.so.0.7 \
libsnoresettings-qt5.so.0.7 \
libstdc++.so.6 \
libz.so.1 \
quassel-base \
update-alternatives"

inherit rpm
