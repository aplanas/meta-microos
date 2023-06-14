SUMMARY = "Mobile web browser"
DESCRIPTION = "Angelfish is a mobile web browser. It supports typical browser features, such \
as bookmarks, history and tabs."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "angelfish-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "293c4f4fea73599849fb54fc5552665cdd2c48dc7eb9e79cb59393cdadedf992b6298f67da840d35bae29eb51a5795dbc30bf6b7d5e3a8f54dbf6b2d93921d7f"

RPROVIDES:${PN} += "angelfish"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5Notifications.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5WebEngine.so.5 \
libQt5WebEngineCore.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
