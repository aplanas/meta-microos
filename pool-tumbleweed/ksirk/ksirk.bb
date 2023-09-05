SUMMARY = "Risk-like game by KDE"
DESCRIPTION = "KsirK is a computerized version of a well known strategy game."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ksirk-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "87bbaf64c84b84d88b78264ac27992617cdfa0107ac9a1401a843f3bc73f08432b236a936672ff79ccdcb58e2b0a34cfd8cf090441592c2772a402df7acc405c"

RPROVIDES:${PN} += "ksirk \
ksirk5 \
libiris-ksirk.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5KDEGamesPrivate.so.7 \
libKF5NewStuff.so.5 \
libKF5Wallet.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libphonon4qt5.so.4 \
libqca-qt5.so.2 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
