SUMMARY = "HTML Image Map Editor"
DESCRIPTION = "A tool to edit image maps of HTML files"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kimagemapeditor-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "1021c144c56c5e9c86f9a2ba1246abc8cfd1a2b922fe144f7486fb50d1725277218763047caa6b5f61f133adf2ff3ed0f3ddfde63b9b7191bc1fc321c1019bfa"

RPROVIDES:${PN} += "kimagemapeditor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
