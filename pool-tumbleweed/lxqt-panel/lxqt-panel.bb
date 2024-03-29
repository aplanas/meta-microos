SUMMARY = "Desktop Panel for LXQt"
DESCRIPTION = "Brand new desktop Panel for LXQt"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-panel-1.3.0-1.2.aarch64.rpm"
RPM_HASH = "9e1143e62f73359c4dea7f7cedcfb91b67a98627f1e2a2958f00c59589a8a2da896433d68ed28c402b9e2462995456b35787d142207c6bd21eaf6a9e93c4f175"

RPROVIDES:${PN} += "config-lxqt-panel \
libbacklight.so \
libcolorpicker.so \
libcpuload.so \
libcustomcommand.so \
libdirectorymenu.so \
libdom.so \
libkbindicator.so \
libmount.so \
libnetworkmonitor.so \
libqeyes.so \
libsensors.so \
libsysstat.so \
libvolume.so \
lxqt-panel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Solid.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xdg.so.3 \
libQt5Xml.so.5 \
libXtst.so.6 \
libasound.so.2 \
libc.so.6 \
libdbusmenu-qt5.so.2 \
liblxqt-globalkeys-ui.so.1 \
liblxqt-globalkeys.so.1 \
liblxqt.so.1 \
libm.so.6 \
libpulse.so.0 \
libsensors.so.4 \
libstatgrab.so.10 \
libstdc++.so.6 \
libsysstat-qt5.so.0 \
libxcb-composite.so.0 \
libxcb-damage.so.0 \
libxcb-image.so.0 \
libxcb-shape.so.0 \
libxcb-util.so.1 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
lxmenu-data"

inherit rpm
