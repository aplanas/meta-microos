SUMMARY = "Library for KDE Games"
DESCRIPTION = "This package contains the KDE games library."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libKF5KDEGames7-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "f6c379e580ecb00b38ce449461855f5e018f454ea16ea79c03dfa98bc0f9aed5451c18be8192157a3ff628bc6078fe118e06baa71c07f80976bb10cecbac5274"

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
