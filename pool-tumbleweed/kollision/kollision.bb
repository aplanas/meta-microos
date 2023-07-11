SUMMARY = "Kollision game"
DESCRIPTION = "KDE version of a classic arcade game"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kollision-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b041275181f560d003c2294f708292498c2ad964c66a4630025f8fbe69fd4a6fe428d226cbf38c781a1c0eaa02517c647f05c9298768ebb44baf2aa29fd5f31b"

RPROVIDES:${PN} += "kollision \
kollision5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5DBusAddons.so.5 \
libKF5I18n.so.5 \
libKF5KDEGames.so.7 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
