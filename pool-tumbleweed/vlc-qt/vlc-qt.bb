SUMMARY = "Qt interface for the VLC media player"
DESCRIPTION = "This subpackage provides a Qt interface for VLC and selects it by \
default when `vlc` is invoked from an X session."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-qt-3.0.18-9.2.aarch64.rpm"
RPM_HASH = "c5c27fafeb6e32c70b9892d393e8eb7fc7ef691a5adb0fff222c13289cb7a33608d2390203af733e29f6a48973e0ea4a813c4851bbbe9f662d521b0e6a6729e1"

RPROVIDES:${PN} += "libqt-plugin.so \
vlc-qt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvlccore.so.9 \
libwayland-client.so.0 \
vlc-noX"

inherit rpm
