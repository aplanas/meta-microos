SUMMARY = "New control center for Linux Deepin"
DESCRIPTION = "The deepin-control-center is the control panel of Deepin Desktop."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.143"

RPM_NAME = "deepin-control-center-5.5.143-1.8.aarch64.rpm"
RPM_HASH = "79e1c8b5f4a8c29691acb8154ae3b41f1f8316b9583bef2b5c88c740c35799f676ed1652c2dcec2c07267c62c19eeaeeb9be50f3f6a0591730709e7cb3379abb"

RPROVIDES:${PN} += "deepin-control-center \
libdccwidgets.so"

RDEPENDS:${PN} += "/usr/bin/bash \
deepin-account-faces \
deepin-api \
deepin-daemon \
deepin-start \
ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Svg.so.5 \
libQt5WaylandClient.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcrypt.so.1 \
libdareader.so.1 \
libdeepin-pw-check.so.1 \
libdeepin-pw-check1 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libgsettings-qt.so.1 \
libm.so.6 \
libpolkit-qt5-core-1.so.1 \
libqt5-qdbus \
libstdc++.so.6 \
libwayland-client.so.0 \
qt5integration \
redshift"

inherit rpm
