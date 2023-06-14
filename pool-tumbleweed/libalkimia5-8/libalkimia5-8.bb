SUMMARY = "Library with common classes and functionality used by finance applications"
DESCRIPTION = "libalkimia is a library for Qt5 with common classes and functionality used by finance \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.1"

RPM_NAME = "libalkimia5-8-8.1.1-1.4.aarch64.rpm"
RPM_HASH = "f86a331032518836cf0731c660e83c37eba9109123f3040df93c1a5e17f484d941be4db0fb62d44ac78bf1aae1d515b51ad430ffcee3431e9a8f5843218d4843"

RPROVIDES:${PN} += "libalkimia5-8 \
libalkimia5.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5KIOCore.so.5 \
libKF5NewStuff.so.5 \
libKF5NewStuffCore.so.5 \
libKF5TextWidgets.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libstdc++.so.6"

inherit rpm
