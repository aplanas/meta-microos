SUMMARY = "Library for KDE Games"
DESCRIPTION = "This package contains the KDE games library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKF5KDEGames7-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "5db2b2d59fa9a7514b2cbf84a9b3e95af4033debe73a840b9ad9f4d50634ffd20ec714371319ae876b268eda25fcf136f38ab0a2f5419047acd282d4beca04b2"

RPROVIDES:${PN} += "libKF5KDEGames.so.7 \
libKF5KDEGames7 \
libKF5KDEGamesPrivate.so.7 \
libkf5kdegames6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5DNSSD.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5NewStuffCore.so.5 \
libKF5NewStuffWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libkdegames \
libkdegames-qt5-imports \
libopenal.so.1 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
