SUMMARY = "Deepin Launcher"
DESCRIPTION = "Deepin desktop-environment - Launcher module"
LICENSE = "GPL-3.0-or-later"

PV = "5.5.31"

RPM_NAME = "deepin-launcher-5.5.31-2.3.aarch64.rpm"
RPM_HASH = "db5577dcaf16a0adb72ba2c3b13b6fb92a4d0b64cbf223cd226663a685da42a313da0694f3232c5feef13966c373e3b75e317b4ab75e50add0894f820bd73948"

RPROVIDES:${PN} += "application() \
application(dde-launcher.desktop) \
deepin-launcher \
deepin-launcher(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
dbus-1 \
deepin-daemon \
deepin-desktop-schemas \
deepin-start \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5X11Extras.so.5()(64bit) \
libQt5X11Extras.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdframeworkdbus.so.2()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libgsettings-qt.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libxcb-ewmh.so.2()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
