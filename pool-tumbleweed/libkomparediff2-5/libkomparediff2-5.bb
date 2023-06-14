SUMMARY = "A library to compare files and strings"
DESCRIPTION = "A library to compare files and strings, used in Kompare and KDevelop."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.04.1"

RPM_NAME = "libkomparediff2-5-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "223e30b7c45b21bed668f58666080bc12820f53600b712669aa45da8d843c3c898a38749e3fd92d861013bcf36a3d07c952782874da8fe8729ad0e66123d1dc7"

RPROVIDES:${PN} += "libkomparediff2 \
libkomparediff2-5 \
libkomparediff2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
