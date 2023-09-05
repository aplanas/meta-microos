SUMMARY = "Ebook reader and library management app"
DESCRIPTION = "An ebook reader and library management app supporting '.epub' files. Arianna \
discovers your books automatically, and sorts them by categories, genres and \
authors."
LICENSE = "GPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "arianna-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "0b838ccbf8f827b4856ed13c6425cb9cb283fdeee481bf6b5915bfeb0fbe78e1cb6cc4f7bae7d28db2229f11069936025eb6b32f3e98a0c29b3c1f6a473895c1"

RPROVIDES:${PN} += "arianna"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
kquickcharts \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Baloo.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5FileMetaData.so.3 \
libKF5I18n.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5WebEngine.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libqt5-qtquickcontrols2 \
libstdc++.so.6"

inherit rpm
