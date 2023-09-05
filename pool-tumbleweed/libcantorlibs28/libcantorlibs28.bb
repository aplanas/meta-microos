SUMMARY = "Shared libraries for Cantor"
DESCRIPTION = "Shared libraries for package cantor."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libcantorlibs28-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "870d95b6992dfe3b8567df4c7c20add907432f7f870c23aa7e1decac3c78a31328e69e38bc98febdbf0b3d242da0bbd17fc3d8f59f7cd2a01d3d6441bb313ab6"

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
