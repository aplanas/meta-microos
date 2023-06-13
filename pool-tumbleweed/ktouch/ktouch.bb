SUMMARY = "Touch Typing Tutor"
DESCRIPTION = "A KDE program that helps you to learn and practice touch typing."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktouch-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "595512b284d8955f8342135b48a3b2ca20e86ba085ce301a312333365ff8b69469e45762707532b35075e26513acd73781f2c2c7ee0c706236c26337d4641681"

RPROVIDES:${PN} += "application() \
application(org.kde.ktouch.desktop) \
kde4-ktouch \
ktouch \
ktouch(aarch-64) \
metainfo() \
metainfo(org.kde.ktouch.appdata.xml)"

RDEPENDS:${PN} += "kdeclarative-components \
kqtquickcharts \
ld-linux-aarch64.so.1()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5ItemViews.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5TextWidgets.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libQt5XmlPatterns.so.5()(64bit) \
libQt5XmlPatterns.so.5(Qt_5)(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libqt5-qtquickcontrols2 \
libstdc++.so.6()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
