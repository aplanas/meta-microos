SUMMARY = "Development tool to test KParts"
DESCRIPTION = "kpartloader is a debugging tool used to test \
loading of KParts."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.04.3"

RPM_NAME = "kpartloader-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "f2fdb9a43d60b67fbae4d373cde5461a54eb759ee9d92e5bb8bf0f890476847c097cdf103e52cd284b649de4aee776afa1749d21ec729a38efc7d9878396a27b"

RPROVIDES:${PN} += "kpartloader"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5Parts.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
