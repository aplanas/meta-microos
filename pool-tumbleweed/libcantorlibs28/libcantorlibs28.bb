SUMMARY = "Shared libraries for Cantor"
DESCRIPTION = "Shared libraries for package cantor."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libcantorlibs28-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "2399737df072229e2d78c649ad7e300413a05ac3b9a3e2e8a8eb9df9b98fcb40295fa236ac947a6e816e4ecfc5fda6d04a337db7acc6d89379da405217781874"

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
