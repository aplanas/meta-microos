SUMMARY = "Mobile web browser"
DESCRIPTION = "Angelfish is a mobile web browser. It supports typical browser features, such \
as bookmarks, history and tabs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "angelfish-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "293c4f4fea73599849fb54fc5552665cdd2c48dc7eb9e79cb59393cdadedf992b6298f67da840d35bae29eb51a5795dbc30bf6b7d5e3a8f54dbf6b2d93921d7f"

RPROVIDES:${PN} += "angelfish \
angelfish(aarch-64) \
application() \
application(org.kde.angelfish.desktop) \
metainfo() \
metainfo(org.kde.angelfish.metainfo.xml) \
mimehandler(text/html) \
mimehandler(x-scheme-handler/http) \
mimehandler(x-scheme-handler/https)"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5WebEngine.so.5()(64bit) \
libQt5WebEngine.so.5(Qt_5)(64bit) \
libQt5WebEngineCore.so.5()(64bit) \
libQt5WebEngineCore.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
