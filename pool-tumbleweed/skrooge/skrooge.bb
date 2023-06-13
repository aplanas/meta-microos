SUMMARY = "A Personal Finance Management Tool"
DESCRIPTION = "Skrooge allows managing personal finances, powered by KDE. \
It has many features and can be used to enter, follow, and \
analyze expenses."
LICENSE = "GPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "skrooge-2.28.0-1.11.aarch64.rpm"
RPM_HASH = "26c35bdc4e52418ee794a942f7a7dafa30042b12807fc5fbbad8239701a61ca62610cd525b47c146c3d1e9ee0790ef2514a7086ea716495d535537ecc351b9f8"

RPROVIDES:${PN} += "application() \
application(org.kde.skrooge.desktop) \
libskgbankgui.so.2()(64bit) \
libskgbankguidesigner.so()(64bit) \
libskgbankmodeler.so.2()(64bit) \
libskgbasegui.so.2()(64bit) \
libskgbaseguidesigner.so()(64bit) \
libskgbasemodeler.so.2()(64bit) \
libskgsqlcipher.so()(64bit) \
metainfo() \
metainfo(org.kde.skrooge.appdata.xml) \
mimehandler(application/vnd.intu.qfx) \
mimehandler(application/x-gnc) \
mimehandler(application/x-gnucash) \
mimehandler(application/x-gsb) \
mimehandler(application/x-homebank) \
mimehandler(application/x-kmymoney) \
mimehandler(application/x-ofx) \
mimehandler(application/x-skg) \
mimehandler(application/x-skgc) \
skrooge \
skrooge(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libGrantlee_Templates.so.5()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5NewStuff.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5Runner.so.5()(64bit) \
libKF5Service.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5Wallet.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Concurrent.so.5()(64bit) \
libQt5Concurrent.so.5(Qt_5)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Script.so.5()(64bit) \
libQt5Script.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libofx.so.7()(64bit) \
libqca-qt5.so.2()(64bit) \
libsqlcipher-3.41.2.so.0()(64bit) \
libstdc++.so.6()(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Layouts.1)"

inherit rpm
