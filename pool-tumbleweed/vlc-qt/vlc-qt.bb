SUMMARY = "Qt interface for the VLC media player"
DESCRIPTION = "This subpackage provides a Qt interface for VLC and selects it by \
default when `vlc` is invoked from an X session."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-qt-3.0.18-8.1.aarch64.rpm"
RPM_HASH = "8d43d563836fb4eff1ca52d39ef2ca6fd483e2ee7c7a116bd2e7a24628411c2575bf33e49b1a0dbac9f28fc2c6d7b42be2db2a481d787a548a938a2ac49fded3"

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
