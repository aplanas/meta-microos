SUMMARY = "HTML Image Map Editor"
DESCRIPTION = "A tool to edit image maps of HTML files"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kimagemapeditor-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "35db55564b28febb83fb3711182a51181db1c3871621a8058d121754183ef85555d3bb3d6bc53781d132b69fc18cd02072df95fff779347275778365d8f6d258"

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
