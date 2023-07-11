SUMMARY = "KDE Archiver Tool"
DESCRIPTION = "This is a KDE application to work with compressed archives."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkerfuffle23-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "bcd842f6f1da4cac03d122aab8710f50e0b525d87ff654bb04b79ad91e2f595fe7749f27fc0335f3a5d9356ab919eb036c346d84a6d1836becf2acdef600bbec"

RPROVIDES:${PN} += "libkerfuffle.so.23 \
libkerfuffle23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libKF5KIOFileWidgets.so.5 \
libKF5KIOWidgets.so.5 \
libKF5Pty.so.5 \
libKF5WidgetsAddons.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
