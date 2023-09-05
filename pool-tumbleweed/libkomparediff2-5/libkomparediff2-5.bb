SUMMARY = "A library to compare files and strings"
DESCRIPTION = "A library to compare files and strings, used in Kompare and KDevelop."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.08.0"

RPM_NAME = "libkomparediff2-5-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "33179053676378f54dcf678d8be2a4b0da39aa59159bf481ef41249bd6b04d41a06b7a0ca2f6b9c3e0ef3b0d4d476478858217405e95484c3dc593cdbe2d8a29"

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
