SUMMARY = "HTML Image Map Editor"
DESCRIPTION = "A tool to edit image maps of HTML files"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kimagemapeditor-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "35db55564b28febb83fb3711182a51181db1c3871621a8058d121754183ef85555d3bb3d6bc53781d132b69fc18cd02072df95fff779347275778365d8f6d258"

RPROVIDES:${PN} += "application() \
application(org.kde.kimagemapeditor.desktop) \
kimagemapeditor \
kimagemapeditor(aarch-64) \
metainfo() \
metainfo(org.kde.kimagemapeditor.appdata.xml) \
mimehandler(text/html)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5Parts.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5WebEngineWidgets.so.5()(64bit) \
libQt5WebEngineWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
