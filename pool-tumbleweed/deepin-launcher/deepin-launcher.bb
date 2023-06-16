SUMMARY = "Deepin Launcher"
DESCRIPTION = "Deepin desktop-environment - Launcher module"
LICENSE = "GPL-3.0-or-later"

PV = "5.5.31"

RPM_NAME = "deepin-launcher-5.5.31-2.3.aarch64.rpm"
RPM_HASH = "db5577dcaf16a0adb72ba2c3b13b6fb92a4d0b64cbf223cd226663a685da42a313da0694f3232c5feef13966c373e3b75e317b4ab75e50add0894f820bd73948"

RPROVIDES:${PN} += "deepin-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
dbus-1 \
deepin-daemon \
deepin-desktop-schemas \
deepin-start \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libc.so.6 \
libdframeworkdbus.so.2 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libgcc-s.so.1 \
libgsettings-qt.so.1 \
libstdc++.so.6 \
libxcb-ewmh.so.2 \
libxcb.so.1"

inherit rpm
