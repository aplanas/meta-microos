SUMMARY = "MIME email parser for KDE PIM - core library"
DESCRIPTION = "This package contains the core libraries needed for the correct parsing of email \
messages."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libKPim5AkonadiMime5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e5e0248af215c53bc36865aa3721f2bd162263f5d2dbb80ecf0052f56ed982a51056eebc9c281d63d2545df53d1bb4ae550cc0529d76f31dd3baf7d2c15bfca1"

RPROVIDES:${PN} += "libKPim5AkonadiMime.so.5 \
libKPim5AkonadiMime5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libKPim5AkonadiCore.so.5 \
libKPim5AkonadiWidgets.so.5 \
libKPim5Mime.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
