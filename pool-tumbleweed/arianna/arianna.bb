SUMMARY = "Ebook reader and library management app"
DESCRIPTION = "An ebook reader and library management app supporting '.epub' files. Arianna \
discovers your books automatically, and sorts them by categories, genres and \
authors."
LICENSE = "GPL-3.0-only"

PV = "1.0.1"

RPM_NAME = "arianna-1.0.1-1.1.aarch64.rpm"
RPM_HASH = "109a078892a9a0b76629f33f54e20092e5067dd5eb4d17124ee067daf84af870a1f154b3af58485df5c7d4995d9e92e0c5430b282a4e7307ddacb47807de0032"

RPROVIDES:${PN} += "arianna"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
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
