SUMMARY = "Qt interface for the VLC media player"
DESCRIPTION = "This subpackage provides a Qt interface for VLC and selects it by \
default when `vlc` is invoked from an X session."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-qt-3.0.18-9.1.aarch64.rpm"
RPM_HASH = "0a44c927e278fc119d0ff36fbeb3bd20cf309400cf89e2da181d8ab44eb6f3b2c3482a7b70d96091dc0e7df60e8f0b3751d6c4cf0258fc142da04d3753b56508"

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
