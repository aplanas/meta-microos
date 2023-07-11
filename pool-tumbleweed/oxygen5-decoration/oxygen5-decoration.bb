SUMMARY = "Oxygen's KWin decoration"
DESCRIPTION = "This package contains the libraries Oxygen's KWin decoration."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "oxygen5-decoration-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "5a84457fd270dac77f75ec7baeb852b710ebe9cd58ccf7a78447b88c21c30585d5c84727f3ecdcaa57ddf8d5d6b901bb286da02be417cf74c0cf0e0d185deafa"

RPROVIDES:${PN} += "oxygen-decoration5 \
oxygen5-decoration"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5GuiAddons.so.5 \
libKF5I18n.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libkdecorations2.so.5 \
liboxygenstyle5.so.5 \
liboxygenstyleconfig5.so.5 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
