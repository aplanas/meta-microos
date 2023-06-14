SUMMARY = "Qt interface for the VLC media player"
DESCRIPTION = "This subpackage provides a Qt interface for VLC and selects it by \
default when `vlc` is invoked from an X session."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-qt-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "6275afd3cf81cfccf31bfc0a2e3f6e9577fa839b9410af7d53905956592cc530d7c002d64b8e95c94b3b54b3ffb25ef8cdec1c3909f0c0b2bb2d949bb1aa2365"

RPROVIDES:${PN} += "libqt-plugin.so \
vlc-qt"

RDEPENDS:${PN} += "/bin/sh \
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
