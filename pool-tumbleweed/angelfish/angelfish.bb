SUMMARY = "Mobile web browser"
DESCRIPTION = "Angelfish is a mobile web browser. It supports typical browser features, such \
as bookmarks, history and tabs."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "angelfish-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "5a9739dff6f67a200934a463cbdb32c12f325e7559e5f5f26c3ff0e9b335e9090b9ac973e6e00a5635d9cba9c9b69912d8f1f64250f9b827c19ccad48880bb56"

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
libQCoro5Quick.so.0 \
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
libfuturesql5.so.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
