SUMMARY = "New control center for Linux Deepin"
DESCRIPTION = "The deepin-control-center is the control panel of Deepin Desktop."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.143"

RPM_NAME = "deepin-control-center-5.5.143-1.7.aarch64.rpm"
RPM_HASH = "50bf99bb91f72fe830009c57e9e74519a54751e7d92570d37245f1e7ba3510a05f5e081fad716e0a3377f7a93f2dbccae66033c9702837aa07c56927a698b944"

RPROVIDES:${PN} += "deepin-control-center \
libdccwidgets.so"

RDEPENDS:${PN} += "/bin/bash \
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
