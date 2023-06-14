SUMMARY = "Risk-like game by KDE"
DESCRIPTION = "KsirK is a computerized version of a well known strategy game."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ksirk-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "99486ebd6b927859dc0bb89af3e945afb1a9de19af6d047913c8afc38dcfcff4a24b5e813d479d7a9739d6c975c42050dee27023fcdc72549a40509302c3bbe4"

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
