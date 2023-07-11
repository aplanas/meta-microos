SUMMARY = "A Personal Finance Management Tool"
DESCRIPTION = "Skrooge allows managing personal finances, powered by KDE. \
It has many features and can be used to enter, follow, and \
analyze expenses."
LICENSE = "GPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "skrooge-2.28.0-1.12.aarch64.rpm"
RPM_HASH = "05a87f5036d1e4d3c8e8863aabfd0e1d12450d14a13807f4c8360a012c27dbe68ede63f8d046f30b8d5ed7c137f7d917968a078d7455279abb51b8c5853db309"

RPROVIDES:${PN} += "libskgbankgui.so.2 \
libskgbankguidesigner.so \
libskgbankmodeler.so.2 \
libskgbasegui.so.2 \
libskgbaseguidesigner.so \
libskgbasemodeler.so.2 \
libskgsqlcipher.so \
skrooge"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libGrantlee-Templates.so.5 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5NewStuff.so.5 \
libKF5Notifications.so.5 \
libKF5NotifyConfig.so.5 \
libKF5Parts.so.5 \
libKF5Runner.so.5 \
libKF5Service.so.5 \
libKF5TextWidgets.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Script.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libofx.so.7 \
libqca-qt5.so.2 \
libsqlcipher-3.41.2.so.0 \
libstdc++.so.6 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Layouts.1"

inherit rpm
