SUMMARY = "A library to compare files and strings"
DESCRIPTION = "A library to compare files and strings, used in Kompare and KDevelop."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.04.3"

RPM_NAME = "libkomparediff2-5-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "c639747112f0495c6797c8abb8f208a72e1aad7268bd91bce22b6399bc59b16d4f067603692b2a3a4d2e1cf502bf18962c65992be3665e92314c074dcb17bf2c"

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
