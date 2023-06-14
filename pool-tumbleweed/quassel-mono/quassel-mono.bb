SUMMARY = "Standalone client for the Quassel IRC client"
DESCRIPTION = "Quassel IRC is a distributed IRC client, meaning that one (or \
multiple) client(s) can attach to and detach from a central core -- \
much like the combination of GNU Screen and a text-based IRC client \
such as WeeChat, but graphical. \
 \
This is the quassel standalone client."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "quassel-mono-0.14.0-1.5.aarch64.rpm"
RPM_HASH = "19dea08181a14f8a386a02b248a4b74aedb9a1223bba35068b720df8d01f77d7b11a29d925bce0a558f48dcf7e9294dce8a96fe7a4abb5df888b592ace2edcad"

RPROVIDES:${PN} += "quassel \
quassel-mono \
quassel-ui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
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
libQt5Sql.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdbusmenu-qt5.so.2 \
libgcc-s.so.1 \
libldap.so.2 \
libqca-qt5.so.2 \
libqt5-sql-backend \
libsnore-qt5.so.0.7 \
libsnoresettings-qt5.so.0.7 \
libstdc++.so.6 \
libz.so.1 \
quassel-base"

inherit rpm
