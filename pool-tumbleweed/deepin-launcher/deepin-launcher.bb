SUMMARY = "Deepin Launcher"
DESCRIPTION = "Deepin desktop-environment - Launcher module"
LICENSE = "GPL-3.0-or-later"

PV = "5.5.31"

RPM_NAME = "deepin-launcher-5.5.31-2.4.aarch64.rpm"
RPM_HASH = "f916f9bfd1b6da0faf739a8d02ef05773f31eaf3eab0c5634edca09e40211b5c67a78e018a02daa4f30d07131f938c548a6361d7ba42f2e134e2351d1ba9fc19"

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
