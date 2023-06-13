SUMMARY = "Terminal application"
DESCRIPTION = "Terminal application offering additional keyboard buttons useful on touch \
devices."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "qmlkonsole-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a7fd181e0c3c93d17f565646017919e8bd31439975c4283260246029d263170ce6af295e781c407209270bee47db37441c8f94fd130d48be58c53b6cba4e21bf"

RPROVIDES:${PN} += "application() \
application(org.kde.qmlkonsole.desktop) \
metainfo() \
metainfo(org.kde.qmlkonsole.appdata.xml) \
qmlkonsole \
qmlkonsole(aarch-64)"

RDEPENDS:${PN} += "kirigami-addons \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit) \
qmltermwidget"

inherit rpm
