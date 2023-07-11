SUMMARY = "QtAV Widgets module"
DESCRIPTION = "QtAV is a multimedia playback library based on Qt and FFmpeg. \
 \
This package contains a set of widgets to play media."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-only"

PV = "1.13.0"

RPM_NAME = "libQtAVWidgets1-1.13.0-3.27.aarch64.rpm"
RPM_HASH = "91d4e8f46d61d717bc2c2b808bb933fc0321552004042bebd352a5598560db08d20c9e8590f3b7e81b313249afb94e4172237f8094acd0b94033dbf19b02392c"

RPROVIDES:${PN} += "libQtAVWidgets.so.1 \
libQtAVWidgets1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5OpenGL.so.5 \
libQt5Widgets.so.5 \
libQtAV.so.1 \
libX11.so.6 \
libXext.so.6 \
libXv.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
