SUMMARY = "Core library to handle text emoticons"
DESCRIPTION = "This package provides a library containing graphical widgets to build \
user interfaces handling emoticons."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libKF5TextEmoticonsWidgets1-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "72278d8b3a802cb7df9984b2aa5172befdf09dc6c2b729e268e48b743186d0873d32706067ac200b39d01464be6ccb2d2ddac28602e1d908239385864a1aff41"

RPROVIDES:${PN} += "libKF5TextEmoticonsWidgets.so.1 \
libKF5TextEmoticonsWidgets1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5I18n.so.5 \
libKF5TextEmoticonsCore.so.1 \
libKF5TextEmoticonsCore1 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
