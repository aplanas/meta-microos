SUMMARY = "Shared libraries for Cantor"
DESCRIPTION = "Shared libraries for package cantor."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libcantorlibs28-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "da615d8f3da6f5cd0a399b2c7d0166414d0ab570d10521a332930497c11dc5f37b01c312c3eccde5f800d8ee7ea36357108a583e7a63ee770a0574c335ebc46d"

RPROVIDES:${PN} += "libcantorlibs.so.28 \
libcantorlibs28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-qt5.so.1 \
libspectre.so.1 \
libstdc++.so.6"

inherit rpm
