SUMMARY = "Risk-like game by KDE"
DESCRIPTION = "KsirK is a computerized version of a well known strategy game."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "ksirk-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "6effbeb397a77faf28bcaa16c99126717586773bac10ad04a41dc2bcb5a1bed19fc8602c35d3163955b4f50e54650f589599d440a8485ac503a7b8194b3aebad"

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
