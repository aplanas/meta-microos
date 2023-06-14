SUMMARY = "Kollision game"
DESCRIPTION = "KDE version of a classic arcade game"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kollision-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "f370ead8293efd63ef1b83e937a1fee5f4fe8804bda5ea683781d3c3ad30d33924088910a978a12590470110d5088310c17c152ecb5317db3db1b0b5706aa04a"

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
